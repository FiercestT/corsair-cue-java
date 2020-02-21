package ca.fiercest.cuesdk.jna;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * Contains information about led and its color<br>
 */
public class CorsairLedColor extends Structure
{
	/**
	 * @see CueSDKLibrary.CorsairLedId
	 * identifier of LED to set<br>
	 * C type : CorsairLedId
	 */
	public int ledId;

	/** red, green, blue [0..255] */
	public int r;
	public int g;
	public int b;

	/**
	 * @param ledId @see CorsairLedId<br>
	 * identifier of LED to set<br>
	 * C type : CorsairLedId<br>
	 * @param r red   brightness[0..255]<br>
	 * @param g green brightness[0..255]<br>
	 * @param b blue  brightness[0..255]
	 */
	public CorsairLedColor(int ledId, int r, int g, int b)
	{
		super();
		this.ledId = ledId;
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public CorsairLedColor()
	{
		super();
	}

	public CorsairLedColor(Pointer peer)
	{
		super(peer);
	}

	protected List<String> getFieldOrder()
	{
		return Arrays.asList("ledId", "r", "g", "b");
	}

	public static class ByReference extends CorsairLedColor implements Structure.ByReference {};
	public static class ByValue extends CorsairLedColor implements Structure.ByValue {};
}
