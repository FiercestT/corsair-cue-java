package ca.fiercest.cuesdk;

import ca.fiercest.cuesdk.jna.JNACorsairChannelDeviceInfo;
import ca.fiercest.cuesdk.jna.JNACorsairChannelInfo;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CorsairChannel extends FrontendObject<JNACorsairChannelInfo>
{
    public int totalLedsCount;
    public int devicesCount;
    public List<CorsairChannelDevice> devices = new ArrayList<>();

    public CorsairChannel(JNACorsairChannelInfo parent)
    {
        super(parent);
        this.totalLedsCount = parent.totalLedsCount;
        this.devicesCount = parent.devicesCount;

        //Map Devices
        if(devicesCount != 0)
        {
            final JNACorsairChannelDeviceInfo[] devices = (JNACorsairChannelDeviceInfo[]) parent.devices.toArray(new JNACorsairChannelDeviceInfo[parent.devicesCount]);
            for(JNACorsairChannelDeviceInfo info : devices)
                this.devices.add(new CorsairChannelDevice(info));
        }

    }
}
