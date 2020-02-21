package ca.fiercest.cuesdk.enums;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum CorsairError
{
    CE_Success("Success"),
    CE_ServerNotFound("Server not found"),
    CE_NoControl("No control"),
    CE_ProtocolHandshakeMissing("Protocol handshake missing"),
    CE_IncompatibleProtocol("Incompatible protocol"),
    CE_InvalidArguments("Invalid arguments");

    @Getter @NonNull private String message;

    public static CorsairError byOrdinal(int ordinal)
    {
        return (ordinal >= 0 && values().length > ordinal) ? values()[ordinal] : null;
    }
}