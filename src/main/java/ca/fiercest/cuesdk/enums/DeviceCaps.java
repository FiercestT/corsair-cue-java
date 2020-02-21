package ca.fiercest.cuesdk.enums;

public enum DeviceCaps
{
    // For devices that do not support any SDK functions
    CDC_None,
    // For devices that has controlled lighting
    CDC_Lighting;

    public static DeviceCaps byOrdinal(int ordinal)
    {
        return (ordinal >= 0 && values().length > ordinal) ? values()[ordinal] : null;
    }
}
