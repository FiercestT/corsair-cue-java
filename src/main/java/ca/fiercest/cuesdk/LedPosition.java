package ca.fiercest.cuesdk;

import ca.fiercest.cuesdk.enums.LedId;
import lombok.Data;

@Data
public class LedPosition {

    private LedId ledId;

    /** values in mm */
    private double top;
    private double left;
    private double height;
    private double width;

    public LedPosition(CorsairLedPosition ledPosition)
    {
        this.ledId = LedId.byOrdinal(ledPosition.ledId);
        this.top = ledPosition.top;
        this.left = ledPosition.left;
        this.height = ledPosition.height;
        this.width = ledPosition.width;
    }
}
