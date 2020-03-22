package ca.fiercest.cuesdk.jna;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class JNACorsairProtocolDetails extends Structure
{
    public Pointer sdkVersion;
    public Pointer serverVersion;
    public int sdkProtocolVersion;
    public int serverProtocolVersion;
    public boolean breakingChanges;

    protected List<String> getFieldOrder()
    {
        return Arrays.asList("sdkVersion", "serverVersion", "sdkProtocolVersion", "serverProtocolVersion", "breakingChanges");
    }

    public static class ByReference extends JNACorsairProtocolDetails implements Structure.ByReference {}
    public static class ByValue extends JNACorsairProtocolDetails implements Structure.ByValue {}
}
