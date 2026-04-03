> **Note:** This project is no longer maintained. It might still work, but there are no guarantees.

# Corsair CUE SDK Wrapper for Java

A Java wrapper for the Corsair ICUE (CUE) SDK. Control Corsair RGB lighting from Java.

Rewritten for Gradle, easier to use, and with more features.

## Installation

Add the JAR from the [releases](https://github.com/FiercestT/corsair-cue-java/releases) to your classpath.

## Building

On every build task, an updated version of the SDK will be downloaded and added to the resource folder. Ensure that JNA is included in the JAR as issues will arise without it.

If the SDK updates on the Corsair Downloads site, update the download link in the DownloadCUESdk task of build.gradle.

The project uses Lombok. Follow [this guide](https://www.baeldung.com/lombok-ide) to configure it with your IDE.

## Documentation

[See the wiki.](https://github.com/FiercestT/corsair-cue-java/wiki)

## Quick Start Example

```java
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
        // Connect to the Corsair Cue SDK
        final CueSDK sdk = new CueSDK(true);

        // Set LED of the Enter key to red
        sdk.SetLedColor(LedId.CLK_Enter, new Color(255, 0, 0));

        // Set color of multiple keys at the same time
        Map<LedId, Color> map = new HashMap<>();
        map.put(LedId.CLK_W, new Color(255, 0, 0));
        map.put(LedId.CLK_A, new Color(0, 0, 255));
        map.put(LedId.CLK_S, new Color(0, 255, 0));
        map.put(LedId.CLK_D, new Color(255, 0, 0));
        sdk.SetLedColors(map);

        Thread.sleep(1000);
    }
}
```
