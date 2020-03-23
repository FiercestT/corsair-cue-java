package ca.fiercest.cuesdk;

import ca.fiercest.cuesdk.enums.DeviceCaps;
import ca.fiercest.cuesdk.enums.DeviceType;
import ca.fiercest.cuesdk.enums.LogicalLayout;
import ca.fiercest.cuesdk.enums.PhysicalLayout;
import ca.fiercest.cuesdk.jna.JNACorsairDeviceInfo;

public class CorsairDevice extends FrontendObject<JNACorsairDeviceInfo>
{
    DeviceType type;
    String modelName;
    PhysicalLayout physicalLayout;
    LogicalLayout logicalLayout;
    DeviceCaps capabilities;
    int ledCount;
    CorsairChannel[] channels;
    byte[] deviceId;

    public CorsairDevice(JNACorsairDeviceInfo parent)
    {
        super(parent);
        this.type = DeviceType.byOrdinal(parent.type);
        this.modelName = parent.model.getString(0);
        this.physicalLayout = PhysicalLayout.byOrdinal(parent.physicalLayout);
        this.logicalLayout = LogicalLayout.byOrdinal(parent.logicalLayout);
        this.capabilities = DeviceCaps.byOrdinal(parent.capsMask);
        this.ledCount = parent.ledsCount;
        //todo this.channels = parent.channels.toArray(1);
        this.deviceId = parent.deviceId;
        DeviceIdHandler.Register(deviceId, this);
    }
}
