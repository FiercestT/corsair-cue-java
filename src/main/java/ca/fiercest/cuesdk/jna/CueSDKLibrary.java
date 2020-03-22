package ca.fiercest.cuesdk.jna;

import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

import java.io.File;
import java.io.IOException;
import java.nio.IntBuffer;

/**
 * JNA Wrapper for library <b>CueSDK</b><br>
 */
public interface CueSDKLibrary extends Library
{
	String JNA_LIBRARY_NAME = "CueSDK";
	CueSDKLibrary INSTANCE = LoadInstance();

	/**
	 * Load the CueSDKLibrary instance from JNA.
	 * @return CueSDKLibrary Library.
	 */
	static CueSDKLibrary LoadInstance()
	{
		try
		{
			File f = Native.extractFromResourcePath("CueSDK");
			System.setProperty("jna.library.path", f.getAbsolutePath());
			return Native.loadLibrary(JNA_LIBRARY_NAME, CueSDKLibrary.class);
		}
		catch (IOException e)
		{
			System.out.println("Fatal Error: Could not load CueSDKLibrary .dll");
			e.printStackTrace();
			return null;
		}
	}

	int CORSAIR_DEVICE_ID_MAX = 128;

	//Callbacks

	interface CorsairEventHandler extends Callback
	{
		void apply(Pointer context, Pointer event);
	}

	interface CorsairSetLedsColorsFlushBufferAsync_callback extends Callback
	{
		void apply(Pointer context, boolean result, byte error);
	}

	interface CorsairSetLedsColorsAsync_callback extends Callback
	{
		void apply(Pointer voidPtr1, boolean bool1);
	}

	interface CorsairRegisterKeypressCallback_callback extends Callback
	{
		void apply(Pointer context, byte keyId, boolean pressed);
	}

	//Utility

	int CorsairGetDeviceCount();

	Pointer CorsairGetDeviceInfo(int deviceIndex);

	Pointer CorsairGetLedPositions();

	Pointer CorsairGetLedPositionsByDeviceIndex(int deviceIndex);

	int CorsairGetLedIdForKeyName(byte keyName);

	boolean CorsairSetLayerPriority(int priority);

	//Lighting

	boolean CorsairSetLedsColors(int size, Pointer ledsColors);

	boolean CorsairSetLedsColorsBufferByDeviceIndex(int deviceIndex, int size, Pointer ledsColors);

	boolean CorsairSetLedsColorsFlushBuffer();

	boolean CorsairSetLedsColorsFlushBufferAsync(CueSDKLibrary.CorsairSetLedsColorsFlushBufferAsync_callback arg1, Pointer context);

	boolean CorsairGetLedsColors(int size, Pointer ledsColors);

	boolean CorsairGetLedsColorsByDeviceIndex(int deviceIndex, int size, Pointer ledsColors);

	boolean CorsairSetLedsColorsAsync(int size, Pointer ledsColors, CueSDKLibrary.CorsairSetLedsColorsAsync_callback arg1, Pointer context);

	//Control

	boolean CorsairReleaseControl(int accessMode);

	int CorsairPerformProtocolHandshake();

	//Properties

	boolean CorsairGetBoolPropertyValue(int deviceIndex, int propertyId, boolean propertyValue);

	boolean CorsairGetInt32PropertyValue(int deviceIndex, int propertyId, IntBuffer propertyValue);

	//Event Handling

	boolean CorsairRegisterKeypressCallback(CueSDKLibrary.CorsairRegisterKeypressCallback_callback arg1, Pointer context);

	boolean CorsairSubscribeForEvents(CueSDKLibrary.CorsairEventHandler onEvent, Pointer context);

	boolean CorsairUnsubscribeFromEvents();

	//Error Handling

	int CorsairGetLastError();
}
