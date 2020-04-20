package ca.fiercest.cuesdk;

import ca.fiercest.cuesdk.enums.DeviceCaps;
import ca.fiercest.cuesdk.enums.DeviceType;
import ca.fiercest.cuesdk.enums.LogicalLayout;
import ca.fiercest.cuesdk.enums.PhysicalLayout;
import ca.fiercest.cuesdk.jna.JNACorsairChannelInfo;
import ca.fiercest.cuesdk.jna.JNACorsairChannelsInfo;
import ca.fiercest.cuesdk.jna.JNACorsairDeviceInfo;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CorsairDevice extends FrontendObject<JNACorsairDeviceInfo>
{
    private DeviceType type;
    private String modelName;
    private PhysicalLayout physicalLayout;
    private LogicalLayout logicalLayout;
    private DeviceCaps capabilities;
    private int ledCount;
    private List<CorsairChannel> channels = new ArrayList<>();
    private byte[] deviceId;

    public CorsairDevice(JNACorsairDeviceInfo parent)
    {
        super(parent);
        this.type = DeviceType.byOrdinal(parent.type);
        this.modelName = parent.model.getString(0);
        this.physicalLayout = PhysicalLayout.byOrdinal(parent.physicalLayout);
        this.logicalLayout = LogicalLayout.byOrdinal(parent.logicalLayout);
        this.capabilities = DeviceCaps.byOrdinal(parent.capsMask);
        this.ledCount = parent.ledsCount;
        this.deviceId = parent.deviceId;

        //Map Channels
        if(parent.channels.channelsCount != 0)
        {
            final JNACorsairChannelsInfo channels = parent.channels;
            final JNACorsairChannelInfo[] rawChannels = (JNACorsairChannelInfo[]) channels.channels.toArray(new JNACorsairChannelInfo[channels.channelsCount]);
            for(JNACorsairChannelInfo c : rawChannels)
                this.channels.add(new CorsairChannel(c));
        }

        DeviceIdHandler.Register(deviceId, this);
    }
}
