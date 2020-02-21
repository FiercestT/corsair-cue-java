package ca.fiercest.cuesdk.jna;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * Contains information about the device<br>
 */
public class CorsairDeviceInfo extends Structure
{
	/**
	 * @see CueSDKLibrary.CorsairDeviceType
	 * Enum describing device type<br>
	 * See type : CorsairDeviceType
	 */
	public int type;

	/**
	 * null - terminated device model(like \u201cK95RGB\u201d)<br>
	 * C type : const char*
	 */
	public Pointer model;

	/**
	 * @see CueSDKLibrary.CorsairPhysicalLayout
	 * enum describing physical layout of the keyboard or mouse<br>
	 * C type : CorsairPhysicalLayout
	 */
	public int physicalLayout;

	/**
	 * @see CueSDKLibrary.CorsairLogicalLayout
	 * enum describing logical layout of the keyboard as set in CUE settings<br>
	 * C type : CorsairLogicalLayout
	 */

	public int logicalLayout;
	/** mask that describes device capabilities, formed as logical \u201cor\u201d of CorsairDeviceCaps enum values */
	public int capsMask;
	/** number of controllable LEDs on the device */
	public int ledsCount;

	/**
	 * @param type @see CorsairDeviceType<br>
	 * enum describing device type<br>
	 * C type : CorsairDeviceType<br>
	 * @param model null - terminated device model(like \u201cK95RGB\u201d)<br>
	 * C type : const char*<br>
	 * @param physicalLayout @see CorsairPhysicalLayout<br>
	 * enum describing physical layout of the keyboard or mouse<br>
	 * C type : CorsairPhysicalLayout<br>
	 * @param logicalLayout @see CorsairLogicalLayout<br>
	 * enum describing logical layout of the keyboard as set in CUE settings<br>
	 * C type : CorsairLogicalLayout<br>
	 * @param capsMask mask that describes device capabilities, formed as logical \u201cor\u201d of CorsairDeviceCaps enum values<br>
	 * @param ledsCount number of controllable LEDs on the device
	 */
	public CorsairDeviceInfo(int type, Pointer model, int physicalLayout, int logicalLayout, int capsMask, int ledsCount)
	{
		super();
		this.type = type;
		this.model = model;
		this.physicalLayout = physicalLayout;
		this.logicalLayout = logicalLayout;
		this.capsMask = capsMask;
		this.ledsCount = ledsCount;
	}

	public CorsairDeviceInfo()
	{
		super();
	}

	public CorsairDeviceInfo(Pointer peer)
	{
		super(peer);
	}

	protected List<String> getFieldOrder()
	{
		return Arrays.asList("type", "model", "physicalLayout", "logicalLayout", "capsMask", "ledsCount");
	}

	public static class ByReference extends CorsairDeviceInfo implements Structure.ByReference {};
	public static class ByValue extends CorsairDeviceInfo implements Structure.ByValue {};
}
