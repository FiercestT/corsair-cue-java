package ca.fiercest.cuesdk;

import ca.fiercest.cuesdk.enums.CorsairError;
import ca.fiercest.cuesdk.enums.LedId;
import ca.fiercest.cuesdk.jna.*;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class CueSDK
{
    private final CueSDKLibrary instance;

    /**
     * Instantiates a new CueSDK, and establishes a connection to the Corsair SDK with shared control.
     */
    public CueSDK()
    {
        this(false);
    }

    /**
     * Instantiates a new CueSDK, and establishes a connection to the Corsair SDK with shared or exclusive control.
     * @param exclusiveLightingControl Whether exclusive light control is needed or not.
     */
    public CueSDK(boolean exclusiveLightingControl)
    {
        instance = CueSDKLibrary.INSTANCE;
        final CorsairProtocolDetails.ByValue protocolDetails = instance.CorsairPerformProtocolHandshake();

        if (protocolDetails.serverProtocolVersion == 0)
            handleError();

        if (protocolDetails.breakingChanges != 0)
        {
            String sdkVersion = protocolDetails.sdkVersion.getString(0);
            String cueVersion = protocolDetails.serverVersion.getString(0);
            throw new RuntimeException("Incompatible SDK (" + sdkVersion + ") and CUE " + cueVersion + " versions.");
        }

        if (exclusiveLightingControl)
        {
            final byte ret = instance.CorsairRequestControl(CueSDKLibrary.CorsairAccessMode.CAM_ExclusiveLightingControl);
            if (ret != 1)
                handleError();
        }
    }

    /**
     * Get the number of connected devices compatible with the Corsair CUE SDK.
     * @return number of devices
     */
    public int getDeviceCount()
    {
        return instance.CorsairGetDeviceCount();
    }

    /**
     *  Retrieve information about a connected device.
     * @param deviceIndex Index of the connected device to get information about
     * @return device information
     */
    public DeviceInfo getDeviceInfo(int deviceIndex)
    {
        return new DeviceInfo(instance.CorsairGetDeviceInfo(deviceIndex));
    }

    /**
     * Retrieve a list of available LED positions, including their id and physical properties.
     * @return list of LED details
     */
    public List<LedPosition> getLedPositions()
    {
        final CorsairLedPositions corsairLedPositions = instance.CorsairGetLedPositions();
        final ArrayList<LedPosition> ledPositions = new ArrayList<>();
        final int count = corsairLedPositions.numberOfLed;

        if (count > 0)
        {
            final CorsairLedPosition.ByReference pLedPosition = corsairLedPositions.pLedPosition;
            final CorsairLedPosition[] nativeLedPositions = (CorsairLedPosition[]) pLedPosition.toArray(new CorsairLedPosition[count]);
            ledPositions.ensureCapacity(count);
            for (CorsairLedPosition nativeLedPosition : nativeLedPositions) {
                ledPositions.add(new LedPosition(nativeLedPosition));
            }

        }
        return ledPositions;
    }

    /**
     * Set the color af several LED at the same time.
     * @param ledColors List of LED identifiers and colors
     */
    public void setLedsColors(Collection<LedColor> ledColors)
    {
        if (ledColors == null || ledColors.isEmpty())
            return;

        if (ledColors.size() == 1)
        {
            setLedColor(ledColors.iterator().next());
            return;
        }

        final Iterator<LedColor> iterator = ledColors.iterator();

        final AtomicInteger index = new AtomicInteger(0);

        final CorsairLedColor[] nativeLedColors = (CorsairLedColor[]) new CorsairLedColor().toArray(ledColors.size());

        iterator.forEachRemaining(c -> copyCorsairLedColor(c, nativeLedColors[index.getAndIncrement()]));

        final byte ret = instance.CorsairSetLedsColors(nativeLedColors.length, nativeLedColors[0]);

        if (ret != 1)
            handleError();
    }

    /**
     * Set the color of a single LED.
     * @param ledColor LED identifier and color
     */
    public void setLedColor(LedColor ledColor)
    {
        if (ledColor == null)
            return;

        final byte ret = instance.CorsairSetLedsColors(1, new CorsairLedColor(ledColor.getLedId(), ledColor.getR(), ledColor.getG(), ledColor.getB()));

        if (ret != 1)
            handleError();
    }

    /**
     * Get the color of an LED.
     * @param ledId The LED to ge the Color of.
     * @return The Color of the LED.
     */
    public Color getLedColor(LedId ledId)
    {
        if (ledId == null)
            return null;

        CorsairLedColor col = new CorsairLedColor(ledId.ordinal(), 0, 0, 0);
		byte ret = instance.CorsairGetLedsColors(1, col);

        if (ret != 1)
            handleError();

		return new Color(col.r, col.g, col.b);
    }

    private void copyCorsairLedColor(LedColor src, CorsairLedColor dst)
    {
        dst.ledId = src.getLedId();
        dst.r = src.getR();
        dst.g = src.getG();
        dst.b = src.getB();
    }

    private void handleError()
    {
        final int errorId = instance.CorsairGetLastError();
        final CorsairError error = CorsairError.byOrdinal(errorId);

        if (error != CorsairError.CE_Success)
            throw new RuntimeException(error + " (" + error.getMessage() + ")");
    }
}
