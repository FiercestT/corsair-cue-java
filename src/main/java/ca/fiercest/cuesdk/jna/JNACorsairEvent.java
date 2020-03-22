package ca.fiercest.cuesdk.jna;

import com.sun.jna.Structure;

import java.util.Collections;
import java.util.List;

public class JNACorsairEvent extends Structure
{
    public int id;

    protected List<String> getFieldOrder()
    {
        return Collections.singletonList("id");
    }

    public static class ByReference extends JNACorsairEvent implements Structure.ByReference {}
    public static class ByValue extends JNACorsairEvent implements Structure.ByValue {}
}
