Corsair CUE SDK Wrapper for Java
===
#### What is It?

A Java Wrapper to connect to the Corsair ICUE (CUE) SDK. Control your corsair lighting from Java! Migrated to Gradle.
Originally created by https://github.com/allanmc/java-cue-sdk and modified by https://github.com/hyphz/java-cue-sdk. 

### Installation
Currently, you can add the jar manually to the classpath from the releases. I will be making a maven repo for it soon.

### Building
On every build task, an updated version of the SDK will be downloaded and added to the resource folder. Ensure that JNA is included in the JAR as issues will arise without it.

### Usage Example
```Java
package ca.fiercest.test;

import ca.fiercest.icuesdk.LedColor;
import ca.fiercest.icuesdk.CueSDK;

public class CueSDKExample 
{
    public static void main(String... args) throws Exception 
    {
        //Connect to the Corsair Cue SDK with the CueSDK object.
        final CueSDK cue = new CueSDK(true);

        // Set LED of the Enter key to red
        cue.setLedColor(new LedColor(LedId.CLK_Enter, 255, 0, 0));
        // Set LED of the left Shift key to green
        cue.setLedColor(new LedColor(LedId.CLK_RightShift, Color.GREEN));

        // Set color of multiple keys at the same time
        cue.setLedsColors(Arrays.asList(
                new LedColor(LedId.CLK_W, Color.YELLOW),
                new LedColor(LedId.CLK_A, Color.YELLOW),
                new LedColor(LedId.CLK_S, Color.YELLOW),
                new LedColor(LedId.CLK_D, Color.YELLOW)
        ));

        // Wait some time before exiting, so we can see the LEDs.
        Thread.sleep(1000);
    }
}

```````
## Reference
###### `public CueSDK()`
Instantiates a new CueSDK, and establishes a connection to the Corsair SDK with shared control.

###### `public CueSDK(boolean exclusiveLightingControl)`
Instantiates a new CueSDK, and establishes a connection to the Corsair SDK with shared or exclusive control.

 * **Parameters:** `exclusiveLightingControl` — Whether exclusive light control is needed or not.

###### `public int getDeviceCount()`
Get the number of connected devices compatible with the Corsair CUE SDK.

 * **Returns:** number of devices

###### `public DeviceInfo getDeviceInfo(int deviceIndex)`
Retrieve information about a connected device.

 * **Parameters:** `deviceIndex` — Index of the connected device to get information about
 * **Returns:** device information

###### `public List<LedPosition> getLedPositions()`
Retrieve a list of available LED positions, including their id and physical properties.

 * **Returns:** list of LED details

###### `public void setLedsColors(Collection<LedColor> ledColors)`
Set the color af several LED at the same time.

 * **Parameters:** `ledColors` — List of LED identifiers and colors

###### `public void setLedColor(LedColor ledColor)`
Set the color of a single LED.

 * **Parameters:** `ledColor` — LED identifier and color

###### `public Color getLedColor(LedId ledid)`
Retrieve the color of a specified lighting zone.

 * **Parameters:** `ledid` — LedId zone (see LedId enum)
 * **Returns:** `java.awt.Color` - LED color
