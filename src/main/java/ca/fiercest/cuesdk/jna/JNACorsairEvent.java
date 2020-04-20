package ca.fiercest.cuesdk.jna;

import ca.fiercest.cuesdk.enums.CorsairEventId;
import com.sun.jna.Structure;
import com.sun.jna.Union;

import java.util.Arrays;
import java.util.List;

public class JNACorsairEvent extends Structure
{
    public int id;
    public UNION.ByReference event;

    public static class UNION extends Union
    {
        public JNACorsairDeviceConnectionStatusChangedEvent deviceConnectionStatusChangedEvent;
        public JNACorsairKeyEvent keyEvent;

        public static class ByReference extends UNION implements Structure.ByReference {}
        public static class ByValue extends UNION implements Structure.ByReference {}
    }

    public void read()
    {
        super.read();
        CorsairEventId id = CorsairEventId.byOrdinal(this.id);
        switch (id)
        {
            case CEI_KeyEvent:
                event.setType(JNACorsairKeyEvent.class);
                break;
            case CEI_DeviceConnectionStatusChangedEvent:
                event.setType(JNACorsairDeviceConnectionStatusChangedEvent.class);
                break;
        }
        event.read();
    }

    protected List<String> getFieldOrder()
    {
        return Arrays.asList("id", "event");
    }

    public static class ByReference extends JNACorsairEvent implements Structure.ByReference {}
    public static class ByValue extends JNACorsairEvent implements Structure.ByValue {}
}
