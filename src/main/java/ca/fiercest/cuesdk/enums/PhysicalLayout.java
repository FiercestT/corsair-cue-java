package ca.fiercest.cuesdk.enums;

/**
 * Available Physical Layouts for Keyboards
 */
public enum PhysicalLayout
{
    CPL_Invalid,
    CPL_US,
    CPL_UK,
    CPL_BR,
    CPL_JP,
    CPL_KR,
    CPL_Zones1,
    CPL_Zones2,
    CPL_Zones3,
    CPL_Zones4;

    public static PhysicalLayout byOrdinal(int ordinal)
    {
        return (ordinal >= 0 && values().length > ordinal) ? values()[ordinal] : null;
    }
}
