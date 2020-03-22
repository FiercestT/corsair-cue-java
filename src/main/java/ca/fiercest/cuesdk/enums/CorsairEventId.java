package ca.fiercest.cuesdk.enums;

public enum CorsairEventId
{
    CEI_Invalid, //Dummy value
    CEI_DeviceConnectionStatusChangedEvent,
    CEI_KeyEvent;

    public static CorsairEventId byOrdinal(int ordinal)
    {
        return (ordinal >= 0 && values().length > ordinal) ? values()[ordinal] : null;
    }
}
