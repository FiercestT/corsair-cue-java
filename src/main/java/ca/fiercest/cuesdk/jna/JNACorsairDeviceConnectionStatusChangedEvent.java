package ca.fiercest.cuesdk.jna;

import com.sun.jna.Structure;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class JNACorsairDeviceConnectionStatusChangedEvent extends Structure
{
    public byte[] deviceId = new byte[(CueSDKLibrary.CORSAIR_DEVICE_ID_MAX)];
    public boolean isConnected;

    protected List<String> getFieldOrder()
    {
        return Arrays.asList("deviceId", "isConnected");
    }

    public static class ByReference extends JNACorsairDeviceConnectionStatusChangedEvent implements Structure.ByReference {}
    public static class ByValue extends JNACorsairDeviceConnectionStatusChangedEvent implements Structure.ByValue {}
}
