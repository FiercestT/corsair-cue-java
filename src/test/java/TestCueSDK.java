import ca.fiercest.cuesdk.Color;
import ca.fiercest.cuesdk.CorsairDevice;
import ca.fiercest.cuesdk.CorsairLedPosition;
import ca.fiercest.cuesdk.CueSDK;
import ca.fiercest.cuesdk.enums.CorsairAccessMode;
import ca.fiercest.cuesdk.enums.LedId;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class TestCueSDK
{
    private static CueSDK sdk;

    @BeforeClass
    public static void setUp()
    {
        sdk = new CueSDK(true);
    }

    private void P(String TAG, Object content)
    {
        System.out.println(String.format("[%s] %s", TAG, content));
    }

    @Test
    public void testProtocolVersion()
    {
        P("ProtocolVersion", sdk.getProtocolDetails());
    }

    @Test
    public void testDevices()
    {
        P("TestDevices", "Device Count: " + sdk.getDeviceCount());
        P("TestDevices", "Devices: " + sdk.getDevices().stream().map(CorsairDevice::getModelName).collect(Collectors.joining(", ")));
    }

    @Test
    public void testLedPositions()
    {
        P("LedPositions", "Led Position Count: " + sdk.getLedPostitions().size());
        P("LedPositions", "LedPositions: " + sdk.getLedPostitions().stream().map(p -> p.getLedId().toString()).collect(Collectors.joining(", ")));
    }

    @Test
    public void testColors() throws Exception
    {
        final Color R = new Color(255, 0, 0);
        final Color G = new Color(0, 255, 0);
        final Color B = new Color(0, 0, 255);
        P("Colors", "Set Color of 'A' to Red for 1000ms");
        sdk.SetLedColor(LedId.CLK_A, R);
        Thread.sleep(500);
        P("Colors", "Get Color of 'A': " + sdk.getLedColor(LedId.CLK_A));
        Thread.sleep(500);
        P("Colors", "Set Color of Multiple Keys for 1000ms");
        Map<LedId, Color> map = new HashMap<>();
        map.put(LedId.CLK_W, R);
        map.put(LedId.CLK_A, G);
        map.put(LedId.CLK_S, B);
        map.put(LedId.CLK_D, R);
        sdk.SetLedColors(map);
        Thread.sleep(1000);

        P("Colors", "Run Random Test");
        final ThreadLocalRandom rand = ThreadLocalRandom.current();
        final List<CorsairLedPosition> ledPositions = sdk.getLedPostitions();

        for (int i = 0; i < 100; i++)
        {
            final int key1 = rand.nextInt(0, ledPositions.size());
            int key2 = rand.nextInt(0, ledPositions.size() - 1);

            if (key1 == key2)
                key2++;

            map = new HashMap<>();
            map.put(ledPositions.get(key1).getLedId(), new Color(rand.nextInt(0, 255), rand.nextInt(0, 255), rand.nextInt(0, 255)));
            map.put(ledPositions.get(key2).getLedId(), new Color(rand.nextInt(0, 255), rand.nextInt(0, 255), rand.nextInt(0, 255)));
            sdk.SetLedColors(map);
            Thread.sleep(10);
        }
        Thread.sleep(1000);
    }

    @Test
    public void testControl() throws Exception
    {
        P("Control", "Starting Exclusive Control for 1000ms");
        sdk.RequestAccessControl(CorsairAccessMode.CAM_ExclusiveLightingControl);
        Thread.sleep(1000);
        P("Control", "Releasing Exclusive Control for 1000ms");
        sdk.ReleaseAccessControl(CorsairAccessMode.CAM_ExclusiveLightingControl);
        Thread.sleep(1000);
    }

    @Test
    public void testCallbacks() throws Exception
    {
        P("Callbacks", "Creating KeyPress and Device State Change Callback for all macro keys for 15,000ms");
        sdk.RegisterKeypressCallback((callbackEvent) ->
            P("Callbacks", "Pressed Key: " + callbackEvent.getKeyId() + ". IsPressed: " + callbackEvent.isPressed())
        );
        sdk.RegisterDeviceChangedCallback((callbackEvent) ->
            P("Callbacks", "Device Connected/Disconnected")
        );
        Thread.sleep(15000);
    }
}