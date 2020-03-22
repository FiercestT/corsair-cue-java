package ca.fiercest.cuesdk.jna;

import com.sun.jna.Structure;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class JNACorsairLedColor extends Structure
{
    // 0-255
    public int r;
    public int g;
    public int b;

    protected List<String> getFieldOrder()
    {
        return Arrays.asList("r", "g", "b");
    }

    public static class ByReference extends JNACorsairLedColor implements Structure.ByReference {}
    public static class ByValue extends JNACorsairLedColor implements Structure.ByValue {}
}
