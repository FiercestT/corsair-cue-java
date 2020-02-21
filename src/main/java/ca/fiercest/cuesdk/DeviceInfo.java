package ca.fiercest.cuesdk;

import ca.fiercest.cuesdk.enums.DeviceCaps;
import ca.fiercest.cuesdk.enums.DeviceType;
import ca.fiercest.cuesdk.enums.LogicalLayout;
import ca.fiercest.cuesdk.enums.PhysicalLayout;
import ca.fiercest.cuesdk.jna.CorsairDeviceInfo;
import lombok.Getter;

@Getter
public class DeviceInfo
{
    // Device Type
    private DeviceType type;

    // Device Model
    private String model;

    // Physical layout of the keyboard or mouse
    private PhysicalLayout physicalLayout;

    // logical layout of the keyboard as set in CUE settings
    private LogicalLayout logicalLayout;

    // Mask that describes device capabilities, formed as logical 'or' of CorsairDeviceCaps enum values
    private int capsMask;

    public DeviceInfo(CorsairDeviceInfo deviceInfo)
    {
        this.type = DeviceType.byOrdinal(deviceInfo.type);
        this.model = deviceInfo.model.getString(0);
        this.physicalLayout = PhysicalLayout.byOrdinal(deviceInfo.physicalLayout);
        this.logicalLayout = LogicalLayout.byOrdinal(deviceInfo.logicalLayout);
    }

    public boolean hasCapability(DeviceCaps cap)
    {
        return (capsMask | cap.ordinal()) == cap.ordinal();
    }
}
