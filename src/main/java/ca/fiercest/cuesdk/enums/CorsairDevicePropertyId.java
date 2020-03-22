package ca.fiercest.cuesdk.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum CorsairDevicePropertyId
{
    CDPI_Headset_MicEnabled(0x1000), // indicates Mic state (On or Off).
    CDPI_Headset_SurroundSoundEnabled(0x1001), // indicates Surround Sound state (On or Off).
    CDPI_Headset_SidetoneEnabled(0x1002), // indicates Sidetone state (On or Off).
    CDPI_Headset_EqualizerPreset(0x2000);  // the number of active equalizer preset (integer, 1 - 5).

    @Getter final int id;

    public static CorsairDevicePropertyId byOrdinal(int ordinal)
    {
        return (ordinal >= 0 && values().length > ordinal) ? values()[ordinal] : null;
    }
}
