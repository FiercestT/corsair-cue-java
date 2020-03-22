package ca.fiercest.cuesdk.jna;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class JNACorsairKeyEvent extends Structure
{
    public byte[] deviceId = new byte[(CueSDKLibrary.CORSAIR_DEVICE_ID_MAX)];
    public int keyId;
    public boolean isPressed;

    protected List<String> getFieldOrder()
    {
        return Arrays.asList("deviceId", "keyId", "isPressed");
    }

    public static class ByReference extends JNACorsairKeyEvent implements Structure.ByReference {}
    public static class ByValue extends JNACorsairKeyEvent implements Structure.ByValue {}
}
