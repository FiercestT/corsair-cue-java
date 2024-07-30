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
        r = (hex >> 16) & 0xff;
        g = (hex >> 8) & 0xff;
        b = (hex) & 0xff;
    }

    public String toString()
    {
        return String.format("[%s, %s, %s]", r, g, b);
    }
}
