package ca.fiercest.cuesdk.jna;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * contains information about SDK and CUE versions.
 */
public class CorsairProtocolDetails extends Structure
{
	/**
	 * null - terminated string containing version of SDK(like \u201c1.0.0.1\u201d). Always contains valid value even if there was no CUE found<br>
	 * C type : const char*
	 */
	public Pointer sdkVersion;

	/**
	 * null - terminated string containing version of CUE(like \u201c1.0.0.1\u201d) or NULL if CUE was not found.<br>
	 * C type : const char*
	 */
	public Pointer serverVersion;

	/** integer number that specifies version of protocol that is implemented by current SDK. Numbering starts from 1. Always contains valid value even if there was no CUE found */
	public int sdkProtocolVersion;

	/** integer number that specifies version of protocol that is implemented by CUE. Numbering starts from 1. If CUE was not found then this value will be 0 */
	public int serverProtocolVersion;

	/** boolean value that specifies if there were breaking changes between version of protocol implemented by server and client */
	public byte breakingChanges;

	/**
	 * @param sdkVersion null - terminated string containing version of SDK(like \u201c1.0.0.1\u201d). Always contains valid value even if there was no CUE found<br>
	 * C type : const char*<br>
	 * @param serverVersion null - terminated string containing version of CUE(like \u201c1.0.0.1\u201d) or NULL if CUE was not found.<br>
	 * C type : const char*<br>
	 * @param sdkProtocolVersion integer number that specifies version of protocol that is implemented by current SDK. Numbering starts from 1. Always contains valid value even if there was no CUE found<br>
	 * @param serverProtocolVersion integer number that specifies version of protocol that is implemented by CUE. Numbering starts from 1. If CUE was not found then this value will be 0<br>
	 * @param breakingChanges boolean value that specifies if there were breaking changes between version of protocol implemented by server and client
	 */
	public CorsairProtocolDetails(Pointer sdkVersion, Pointer serverVersion, int sdkProtocolVersion, int serverProtocolVersion, byte breakingChanges)
	{
		super();
		this.sdkVersion = sdkVersion;
		this.serverVersion = serverVersion;
		this.sdkProtocolVersion = sdkProtocolVersion;
		this.serverProtocolVersion = serverProtocolVersion;
		this.breakingChanges = breakingChanges;
	}

	public CorsairProtocolDetails()
	{
		super();
	}

	public CorsairProtocolDetails(Pointer peer)
	{
		super(peer);
	}

	protected List<String> getFieldOrder()
	{
		return Arrays.asList("sdkVersion", "serverVersion", "sdkProtocolVersion", "serverProtocolVersion", "breakingChanges");
	}

	public static class ByReference extends CorsairProtocolDetails implements Structure.ByReference {};
	public static class ByValue extends CorsairProtocolDetails implements Structure.ByValue {};
}
