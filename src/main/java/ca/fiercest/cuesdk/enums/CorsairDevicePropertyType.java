package ca.fiercest.cuesdk.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum CorsairDevicePropertyType
{
    CDPT_Boolean(0x1000),
    CDPT_Int32(0x2000);

    @Getter final int id;

    public static CorsairDevicePropertyType byOrdinal(int ordinal)
    {
        return (ordinal >= 0 && values().length > ordinal) ? values()[ordinal] : null;
    }
}
