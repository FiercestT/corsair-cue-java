package ca.fiercest.cuesdk;

import ca.fiercest.cuesdk.jna.JNACorsairChannelnfo;
import lombok.Getter;

@Getter
public class CorsairChannel extends FrontendObject<JNACorsairChannelnfo>
{
    public int totalLedsCount;
    public int devicesCount;
    public CorsairChannelDevice[] devices;

    public CorsairChannel(JNACorsairChannelnfo parent)
    {
        super(parent);
        this.totalLedsCount = parent.totalLedsCount;
        this.devicesCount = parent.devicesCount;
        // todo map these this.devices = parent.devices.toArray()
    }
}
