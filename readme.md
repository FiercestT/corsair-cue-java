Corsair CUE SDK Wrapper for Java
===
#### What is It?

A Java Wrapper to connect to the Corsair ICUE (CUE) SDK. Control your corsair lighting from Java! Migrated to Gradle.
Originally created by [allanmc](https://github.com/allanmc/java-cue-sdk) and modified by [hyphz](https://github.com/hyphz/java-cue-sdk). 

### Installation
Currently, you can add the jar manually to the classpath from the [releases](https://github.com/FiercestT/corsair-cue-java/releases). I will be making a maven repo for it soon.

### Building
On every build task, an updated version of the SDK will be downloaded and added to the resource folder. Ensure that JNA is included in the JAR as issues will arise without it.

The project now uses Lombok, follow this [this](https://www.baeldung.com/lombok-ide) guide to configure it with your IDE.

### Quick Start Example
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
### Todo
- Add more native methods (PR's <3)
- Add a public maven repo.
