package ca.fiercest.cuesdk.jna;

import com.sun.jna.Structure;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class JNACorsairChannelInfo extends Structure
{
    public int totalLedsCount;
    public int devicesCount;
    public JNACorsairChannelDeviceInfo.ByReference devices; //Array

    protected List<String> getFieldOrder()
    {
        return Arrays.asList("totalLedsCount", "devicesCount", "devices");
    }

    public static class ByReference extends JNACorsairChannelInfo implements Structure.ByReference {}
    public static class ByValue extends JNACorsairChannelInfo implements Structure.ByValue {}
}
