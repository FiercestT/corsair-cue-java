package ca.fiercest.cuesdk.jna;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * Contains led id and position of led rectangle. Most of the keys are rectangular.
 * In case if key is not rectangular(like Enter in ISO / UK layout) it returns the smallest rectangle that fully contains the key<br>
 */
public class CorsairLedPosition extends Structure
{
	/**
	 * @see CueSDKLibrary.CorsairLedId
	 * identifier of led<br>
	 * C type : CorsairLedId
	 */
	public int ledId;

	/** values in mm */
	public double top;
	public double left;
	public double height;
	public double width;

	/**
	 * @param ledId @see CorsairLedId<br>
	 * identifier of led<br>
	 * C type : CorsairLedId<br>
	 * @param width values in mm
	 */
	public CorsairLedPosition(int ledId, double top, double left, double height, double width)
	{
		super();
		this.ledId = ledId;
		this.top = top;
		this.left = left;
		this.height = height;
		this.width = width;
	}

	public CorsairLedPosition()
	{
		super();
	}

	public CorsairLedPosition(Pointer peer)
	{
		super(peer);
	}

	protected List<String> getFieldOrder()
	{
		return Arrays.asList("ledId", "top", "left", "height", "width");
	}

	public static class ByReference extends CorsairLedPosition implements Structure.ByReference {};
	public static class ByValue extends CorsairLedPosition implements Structure.ByValue {};
}
