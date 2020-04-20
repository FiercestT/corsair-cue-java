Corsair CUE SDK Wrapper for Java
===
#### What is It?

A Java Wrapper to connect to the Corsair ICUE (CUE) SDK. Control your corsair lighting from Java! Migrated to Gradle. Completely rewritten, easier to use, and with more features.

### Installation
Currently, you can add the jar manually to the classpath from the [releases](https://github.com/FiercestT/corsair-cue-java/releases). I will be making a maven repo for it soon.

### Building
On every build task, an updated version of the SDK will be downloaded and added to the resource folder. Ensure that JNA is included in the JAR as issues will arise without it.

If the SDK updates on the Corsair Downloads site, update the download link in the DownloadCUESdk task of build.gradle.

The project now uses Lombok, follow this [this](https://www.baeldung.com/lombok-ide) guide to configure it with your IDE.

### Documentation

[See the wiki.](https://github.com/FiercestT/corsair-cue-java/wiki)

### Quick Start Example
```Java
package ca.fiercest.test;

import ca.fiercest.cuesdk.CueSDK;
import ca.fiercest.cuesdk.enums.LedId;
import ca.fiercest.cuesdk.Color;

import java.util.Map;
import java.util.HashMap;

public class CueSDKExample 
{
    public static void main(String... args) throws Exception 
    {
        //Connect to the Corsair Cue SDK with the CueSDK object.
        final CueSDK sdk = new CueSDK(true);

        // Set LED of the Enter key to red
        sdk.SetLedColor(LedId.CLK_Enter, new Color(255, 0, 0));
        // Set LED of the left Shift key to green
        sdk.SetLedColor(LedId.CLK_Enter, new Color(0, 255, 0));

        // Set color of multiple keys at the same time
        Map<LedId, Color> map = new HashMap<>();
        map.put(LedId.CLK_W, new Color(255, 0, 0));
        map.put(LedId.CLK_A, new Color(0, 0, 255));
        map.put(LedId.CLK_S, new Color(0, 255, 0));
        map.put(LedId.CLK_D, new Color(255, 0, 0));
        sdk.SetLedColors(map);

        // Wait some time before exiting, so we can see the LEDs.
        Thread.sleep(1000);
    }
}
```````
### Todo
- Add a public maven repo.
