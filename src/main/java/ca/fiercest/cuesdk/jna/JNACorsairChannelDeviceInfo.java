package ca.fiercest.cuesdk.jna;

import com.sun.jna.Structure;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

/**
 * Contains information about separate LED-devices connected to the channel controlled by the DIY-device.
 */
@AllArgsConstructor
@NoArgsConstructor
public class JNACorsairChannelDeviceInfo extends Structure
{
    public int type;
    public int deviceLedCount;

    protected List<String> getFieldOrder() {
        return Arrays.asList("type", "deviceLedCount");
    }

    public static class ByReference extends JNACorsairChannelDeviceInfo implements Structure.ByReference {}
    public static class ByValue extends JNACorsairChannelDeviceInfo implements Structure.ByValue {}
}
