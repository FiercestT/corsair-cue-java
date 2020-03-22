package ca.fiercest.cuesdk.enums;

/**
 * Available SDK access modes.
 */
public enum CorsairAccessMode
{
    CAM_ExclusiveLightingControl;

    public static CorsairAccessMode byOrdinal(int ordinal)
    {
        return (ordinal >= 0 && values().length > ordinal) ? values()[ordinal] : null;
    }
}
