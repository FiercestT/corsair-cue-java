package ca.fiercest.cuesdk;

import ca.fiercest.cuesdk.jna.JNACorsairProtocolDetails;
import lombok.Getter;

@Getter
public class CorsairProtocolDetails extends FrontendObject<JNACorsairProtocolDetails>
{
    private String sdkVersion;
    private String serverVersion;
    private int sdkProtocolVersion;
    private int serverProtocolVersion;
    private boolean breakingChanges;

    protected CorsairProtocolDetails(JNACorsairProtocolDetails parent)
    {
        super(parent);
        sdkVersion = parent.sdkVersion.getString(0);
        serverVersion = parent.sdkVersion.getString(0);
        sdkProtocolVersion = parent.sdkProtocolVersion;
        serverProtocolVersion = parent.serverProtocolVersion;
        breakingChanges = parent.breakingChanges;
    }
}
