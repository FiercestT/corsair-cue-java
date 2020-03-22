package ca.fiercest.cuesdk.enums;

/**
 * Device Capabilities
 */
public enum DeviceCaps
{
    CDC_None,           //Devices that do not support the SDK.
    CDC_Lighting,       //Devices that have controlled lighting.
    CDC_PropertyLookup; //Devices that provide state through a set of properties.

    public static DeviceCaps byOrdinal(int ordinal)
    {
        return (ordinal >= 0 && values().length > ordinal) ? values()[ordinal] : null;
    }
}
