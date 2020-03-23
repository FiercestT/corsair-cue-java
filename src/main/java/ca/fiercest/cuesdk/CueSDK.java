package ca.fiercest.cuesdk;

import ca.fiercest.cuesdk.enums.CorsairAccessMode;
import ca.fiercest.cuesdk.enums.LedId;
import ca.fiercest.cuesdk.jna.CueSDKLibrary;
import ca.fiercest.cuesdk.jna.JNACorsairLedPositions;
import com.sun.jna.Pointer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class CueSDK
{
    //region Constructors
    /**
     * Overloaded Constructor that does not use any access mode.
     */
    public CueSDK()
    {
        this(null);
    }

    /**
     * Overloaded Constructor that allows for exclusive access mode.
     * @param exclusiveAccessMode
     */
    public CueSDK(boolean exclusiveAccessMode)
    {
        this(exclusiveAccessMode ? CorsairAccessMode.CAM_ExclusiveLightingControl : null);
    }

    /**
     * Creates the CueSDK Object with a specific access mode.
     * @param accessMode The specific access mode will be applied on initialization.
     */
    public CueSDK(CorsairAccessMode accessMode)
    {

    }
    //endregion

    //region Utilities
    public int getDeviceCount()
    {
        return CueSDKLibrary.INSTANCE.CorsairGetDeviceCount();
    }

    private List<CorsairDevice> deviceCache = new ArrayList<>();
    public List<CorsairDevice> getDevices()
    {
        if(!deviceCache.isEmpty())
            return deviceCache;
        for(int i = 0; i < getDeviceCount(); i++)
            deviceCache.add(new CorsairDevice(CueSDKLibrary.INSTANCE.CorsairGetDeviceInfo(i)));
        return deviceCache;
    }

    private List<CorsairLedPosition> positionCache = new ArrayList<>();
    public List<CorsairLedPosition> getLedPostitions()
    {
        if(!positionCache.isEmpty())
            return positionCache;
        JNACorsairLedPositions rawPos = CueSDKLibrary.INSTANCE.CorsairGetLedPositions();
        rawPos.
            positionCache.add(new CorsairLedPosition(CueSDKLibrary.INSTANCE.CorsairGetDeviceInfo(i)));
        return positionCache;
    }
    //endregion

    //region Lighting
    public void SetLedColors(Map<LedId, Color> colorMap)
    {

    }

    public void SetLedColor(LedId id, Color color)
    {

    }

    public Color getLedColor(LedId id)
    {
        return null;
    }
    //endregion

    //region Control
    public boolean RequestAccessControl(CorsairAccessMode accessMode)
    {
        return CueSDKLibrary.INSTANCE.CorsairRequestControl(accessMode.ordinal());
    }

    public boolean ReleaseAccessControl(CorsairAccessMode accessMode)
    {
        return CueSDKLibrary.INSTANCE.CorsairReleaseControl(accessMode.ordinal());
    }

    public CorsairProtocolDetails GetSDKInfo()
    {
        return null;
    }
    //endregion

    //region EventHandling
    /**
     * Registers a callback when a specific {@link ca.fiercest.cuesdk.enums.KeyId} is pressed.
     * @param callback The consumer that is run whenever the callback is invoked.
     * @param context ?
     * @return Whether the callback was added successfully or not (natively passed).
     */
    public boolean RegisterKeypressCallback(Consumer<KeyCallbackEvent> callback, Pointer context)
    {
        return CueSDKLibrary.INSTANCE.CorsairRegisterKeypressCallback(((context1, keyId, pressed) -> callback.accept(new KeyCallbackEvent(keyId, pressed))), context);
    }

    /**
     * Unsubscribes from all events.
     * @return Whether the method was successful or not (natively passed).
     */
    public boolean UnsubscribeFromCallbacks()
    {
        return CueSDKLibrary.INSTANCE.CorsairUnsubscribeFromEvents();
    }
    //endregion
}
