package ca.fiercest.cuesdk.jna;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * Contains number of leds and arrays with their positions.
 */
public class CorsairLedPositions extends Structure
{
	/** integer value.Number of elements in following array */
	public int numberOfLed;

	/**
	 * array of led positions<br>
	 * C type : CorsairLedPosition*
	 */
	public CorsairLedPosition.ByReference pLedPosition;

	/**
	 * @param numberOfLed integer value.Number of elements in following array<br>
	 * @param pLedPosition array of led positions<br>
	 * C type : CorsairLedPosition*
	 */
	public CorsairLedPositions(int numberOfLed, CorsairLedPosition.ByReference pLedPosition)
	{
		super();
		this.numberOfLed = numberOfLed;
		this.pLedPosition = pLedPosition;
	}

	public CorsairLedPositions()
	{
		super();
	}

	public CorsairLedPositions(Pointer peer)
	{
		super(peer);
	}

	protected List<String> getFieldOrder()
	{
		return Arrays.asList("numberOfLed", "pLedPosition");
	}

	public static class ByReference extends CorsairLedPositions implements Structure.ByReference {};
	public static class ByValue extends CorsairLedPositions implements Structure.ByValue {};
}
