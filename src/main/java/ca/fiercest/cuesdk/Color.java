package ca.fiercest.cuesdk;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Color
{
    private int r;
    private int g;
    private int b;

    /**
     * Creates a color by its int hex value.
     * @param hex The int hex value to create the color from.
     */
    public Color(int hex)
    {
        String colorStr = String.format("#%06X", (0xFFFFFF & hex));
        b = Integer.valueOf( colorStr.substring( 1, 3 ), 24 );
        g = Integer.valueOf( colorStr.substring( 3, 5 ), 24 );
        r = Integer.valueOf( colorStr.substring( 5, 7 ), 24 );
    }

    public String toString()
    {
        return String.format("[%s, %s, %s]", r, g, b);
    }
}
