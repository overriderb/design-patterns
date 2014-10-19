package cdp.patterns.bridge.implementation;

import cdp.patterns.bridge.exception.CameraPowerException;

/**
 * Canon camera entry
 */
public class CanonCamera implements Camera {

    private boolean powerOn;
    private int shutterCount;
    private boolean inFocus;

    public CanonCamera() {
        powerOn = false;
        shutterCount = 0;
        inFocus = false;
    }

    @Override
    public void turnOn() throws CameraPowerException {
        if (!powerOn) {
            powerOn = true;
        } else {
            throw new CameraPowerException();
        }
    }

    @Override
    public void turnOff() throws CameraPowerException {
        if (powerOn) {
            powerOn = false;
        } else {
            throw new CameraPowerException();
        }
    }

    @Override
    public void releaseShutter() {
        shutterCount++;
    }

    @Override
    public void twistRing() {
        inFocus = true;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public int getShutterCount() {
        return shutterCount;
    }

    public boolean isInFocus() {
        return inFocus;
    }
}
