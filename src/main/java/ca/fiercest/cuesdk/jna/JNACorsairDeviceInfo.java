package ca.fiercest.cuesdk.jna;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class JNACorsairDeviceInfo extends Structure
{
    public int type;
    public Pointer model;
    public int physicalLayout;
    public int logicalLayout;
    public int capsMask;
    public int ledsCount;
    public JNACorsairChannelsInfo channels;
    public byte[] deviceId = new byte[(CueSDKLibraryOld.CORSAIR_DEVICE_ID_MAX)];

    protected List<String> getFieldOrder()
    {
        return Arrays.asList("type", "model", "physicalLayout", "logicalLayout", "capsMask", "ledsCount", "channels", "deviceId");
    }

    public static class ByReference extends JNACorsairDeviceInfo implements Structure.ByReference {}

    public static class ByValue extends JNACorsairDeviceInfo implements Structure.ByValue {}
}

