package ca.fiercest.cuesdk.jna;

import com.sun.jna.Structure;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class JNACorsairChannelsInfo extends Structure
{
    public int channelsCount;
    public JNACorsairChannelnfo.ByReference channels;

    protected List<String> getFieldOrder()
    {
        return Arrays.asList("channelsCount", "channels");
    }

    public static class ByReference extends JNACorsairChannelsInfo implements Structure.ByReference {}

    public static class ByValue extends JNACorsairChannelsInfo implements Structure.ByValue {}
}
