package ca.fiercest.cuesdk;

import ca.fiercest.cuesdk.enums.LedId;
import ca.fiercest.cuesdk.jna.CorsairLedColor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Data
public class LedColor {

    private int ledId;
    // red   brightness[0..255]
    private int r;
    // green brightness[0..255]
    private int g;
    // blue  brightness[0..255]
    private int b;

    public LedColor(CorsairLedColor ledColor) {
        this(ledColor.ledId, ledColor.r, ledColor.g, ledColor.b);
    }

    public LedColor(LedId ledId, int r, int g, int b) {
        this(ledId.ordinal(), r, g, b);
    }

    public LedColor(LedId ledId, Color color) {
        this(ledId.ordinal(), color);
    }

    public LedColor(LedPosition ledPosition, int r, int g, int b) {
        this(ledPosition.getLedId(), r, g, b);
    }

    public LedColor(LedPosition ledPosition, Color color) {
        this(ledPosition.getLedId(), color);
    }

    public LedColor(int ledId, Color color) {
        this(ledId, color.getRed(), color.getGreen(), color.getBlue());
    }

    public LedColor(int ledId, int r, int g, int b)
    {
        this.ledId = ledId;
        this.r = r;
        this.g = g;
        this.b = b;
    }
}
