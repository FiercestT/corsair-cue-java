package ca.fiercest.cuesdk.enums;

public enum CorsairChannelDeviceType
{
    CCDT_Invalid,
    CCDT_HD_Fan,
    CCDT_SP_Fan,
    CCDT_LL_Fan,
    CCDT_ML_Fan,
    CCDT_Strip,
    CCDT_DAP,
    CCDT_Pump,
    CCDT_QL_Fan,
    CCDT_WaterBlock,
    CCDT_SPPRO_Fan;

    public static CorsairChannelDeviceType byOrdinal(int ordinal)
    {
        return (ordinal >= 0 && values().length > ordinal) ? values()[ordinal] : null;
    }
}
