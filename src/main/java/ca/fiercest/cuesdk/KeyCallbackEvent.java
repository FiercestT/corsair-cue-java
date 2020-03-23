package ca.fiercest.cuesdk;

import ca.fiercest.cuesdk.enums.KeyId;
import lombok.Getter;

@Getter
public class KeyCallbackEvent
{
    private final KeyId keyId;
    private final boolean pressed;

    protected KeyCallbackEvent(byte keyId, boolean pressed)
    {
        this.keyId = KeyId.byOrdinal(keyId);
        this.pressed = pressed;
    }
}
