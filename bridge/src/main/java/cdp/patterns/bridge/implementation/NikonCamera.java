package cdp.patterns.bridge.implementation;

/**
 * Nikon camera
 */
public class NikonCamera implements Camera {

    private boolean powerOn;
    private int shutterCount;
    private boolean inFocus;

    public NikonCamera() {
        powerOn = false;
        shutterCount = 0;
        inFocus = false;
    }

    @Override
    public void turnOn() {
        powerOn = true;
    }

    @Override
    public void turnOff() {
        powerOn = false;
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
