import ca.fiercest.cuesdk.CueSDK;
import ca.fiercest.cuesdk.enums.CorsairAccessMode;
import ca.fiercest.cuesdk.jna.CueSDKLibrary;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCueSDK
{
    private static CueSDK instance;

    @BeforeClass
    public static void setUp()
    {
        instance = new CueSDK();
    }

    @Test
    public void testGetDeviceCount()
    {
        final CorsairProtocolDetails.ByValue protocolDetails = instance.CorsairPerformProtocolHandshake();
        instance.RequestControl(CorsairAccessMode.CAM_ExclusiveLightingControl);
        System.out.println(CueSDKLibrary.INSTANCE);
        System.out.println(instance.getDeviceCount());
        instance.ReleaseControl(CorsairAccessMode.CAM_ExclusiveLightingControl);
    }

}
