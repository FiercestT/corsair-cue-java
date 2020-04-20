package ca.fiercest.cuesdk.jna;

import com.sun.jna.Structure;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class JNACorsairLedPositions extends Structure
{
    public int numberOfLed;
    public JNACorsairLedPosition.ByReference pLedPosition; //Array

    protected List<String> getFieldOrder()
    {
        return Arrays.asList("numberOfLed", "pLedPosition");
    }

    public static class ByReference extends JNACorsairLedPositions implements Structure.ByReference {}
    public static class ByValue extends JNACorsairLedPositions implements Structure.ByValue {}
}

