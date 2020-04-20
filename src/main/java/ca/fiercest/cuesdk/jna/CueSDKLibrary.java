package ca.fiercest.cuesdk.jna;

import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

import java.io.File;
import java.io.IOException;

/**
 * JNA Wrapper for library <b>CueSDK</b><br>
 */
public interface CueSDKLibrary extends Library
{
	String JNA_LIBRARY_NAME = "CueSDK";
	CueSDKLibrary INSTANCE = LoadInstance();

	/**
	 * Load the CueSDKLibrary instance from JNA.
	 * @return CueSDKLibrary Library. Nullable if could not be loaded.
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
		//@param event CorsairEvent
		void apply(Pointer context, JNACorsairEvent event);
	}

	//Utility

	int CorsairGetDeviceCount();

	//@return JNACorsairDeviceInfo
	JNACorsairDeviceInfo CorsairGetDeviceInfo(int deviceIndex);

	//@return JNACorsairLedPositions
	JNACorsairLedPositions CorsairGetLedPositions();

	//Lighting

	//@param ledsColors CorsairLedColor[]
	boolean CorsairSetLedsColors(int size, JNACorsairLedColor ledsColors);

	boolean CorsairGetLedsColors(int size, JNACorsairLedColor ledsColors);

	//Control

	boolean CorsairRequestControl(int accessMode);

	boolean CorsairReleaseControl(int accessMode);

	JNACorsairProtocolDetails.ByValue CorsairPerformProtocolHandshake();

	//Event Handling

	boolean CorsairUnsubscribeFromEvents(); //Unused but keeping it here just in case.

	boolean CorsairSubscribeForEvents(CorsairEventHandler onEvent, Pointer context);

	//Error Handling

	int CorsairGetLastError();

	//region Unused
	/*
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
		//@param keyId CorsairKeyId
		void apply(Pointer context, byte keyId, boolean pressed);
	}

	boolean CorsairSetLedsColorsFlushBufferAsync(CueSDKLibrary.CorsairSetLedsColorsFlushBufferAsync_callback arg1, Pointer context);

	boolean CorsairSetLedsColorsAsync(int size, Pointer ledsColors, CueSDKLibrary.CorsairSetLedsColorsAsync_callback arg1, Pointer context);

	Pointer CorsairGetLedPositionsByDeviceIndex(int deviceIndex);

	boolean CorsairSetLayerPriority(int priority);

	boolean CorsairGetBoolPropertyValue(int deviceIndex, int propertyId, boolean propertyValue);

	boolean CorsairGetInt32PropertyValue(int deviceIndex, int propertyId, IntBuffer propertyValue);

	boolean CorsairSetLedsColorsBufferByDeviceIndex(int deviceIndex, int size, Pointer ledsColors);

	boolean CorsairSetLedsColorsFlushBuffer();

	int CorsairGetLedIdForKeyName(byte keyName);

	boolean CorsairGetLedsColorsByDeviceIndex(int deviceIndex, int size, Pointer ledsColors);

	boolean CorsairRegisterKeypressCallback(CorsairRegisterKeypressCallback_callback callback, Pointer context); //Works
	*/
	//endregion
}
