package ca.fiercest.cuesdk.enums;

/**
 * Logical layouts for Keyboards
 */
public enum LogicalLayout
{
    CLL_Invalid,
    CLL_US_Int,
    CLL_NA,
    CLL_EU,
    CLL_UK,
    CLL_BE,
    CLL_BR,
    CLL_CH,
    CLL_CN,
    CLL_DE,
    CLL_ES,
    CLL_FR,
    CLL_IT,
    CLL_ND,
    CLL_RU,
    CLL_JP,
    CLL_KR,
    CLL_TW,
    CLL_MEX;

    public static LogicalLayout byOrdinal(int ordinal)
    {
        return (ordinal >= 0 && values().length > ordinal) ? values()[ordinal] : null;
    }
}
