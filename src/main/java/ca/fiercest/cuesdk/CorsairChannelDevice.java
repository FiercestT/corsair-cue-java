package ca.fiercest.cuesdk;

import ca.fiercest.cuesdk.enums.CorsairChannelDeviceType;
import ca.fiercest.cuesdk.jna.JNACorsairChannelDeviceInfo;

public class CorsairChannelDevice extends FrontendObject<JNACorsairChannelDeviceInfo>
{
    public CorsairChannelDeviceType type;
    public int deviceLedCount;

    public CorsairChannelDevice(JNACorsairChannelDeviceInfo parent)
    {
        super(parent);
        this.type = CorsairChannelDeviceType.byOrdinal(parent.type);
        this.deviceLedCount = parent.deviceLedCount;
    }
}
