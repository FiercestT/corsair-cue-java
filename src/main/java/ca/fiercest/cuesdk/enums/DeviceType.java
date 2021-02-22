package ca.fiercest.cuesdk.enums;

/**
 * Available Device Types.
 */
public enum DeviceType
{
    CDT_Unknown,
    CDT_Mouse,
    CDT_Keyboard,
    CDT_Headset,
    CDT_MouseMat,
    CDT_HeadsetStand,
    CDT_CommanderPro,
    CDT_LightingNodePro,
    CDT_MemoryModule,
    CDT_Cooler,
    CDT_Motherboard,
    CDT_GraphicsCard;

    public static DeviceType byOrdinal(int ordinal)
    {
        return (ordinal >= 0 && values().length > ordinal) ? values()[ordinal] : null;
    }
}
