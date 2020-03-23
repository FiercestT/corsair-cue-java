package ca.fiercest.cuesdk;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public final class DeviceIdHandler
{
    private static Map<String, CorsairDevice> deviceMap = new HashMap<>();

    public static void Register(byte[] id, CorsairDevice device)
    {
        deviceMap.putIfAbsent(convert(id), device);
    }

    public static CorsairDevice getById(byte[] id)
    {
        return deviceMap.get(convert(id));
    }

    public static byte[] getDeviceId(CorsairDevice device)
    {
        return device.deviceId;
    }

    private static String convert(byte[] id)
    {
        StringBuilder result = new StringBuilder();
        for(byte i: id)
            result.append((char) i);
        return result.toString();
    }
}
