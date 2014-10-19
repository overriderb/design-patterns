package cdp.patterns.bridge.implementation;

import cdp.patterns.bridge.exception.CameraPowerException;

/**
 * Abstract camera
 */
public interface Camera {

    public void turnOn() throws CameraPowerException;
    public void turnOff() throws CameraPowerException;
    public void releaseShutter();
    public void twistRing();
}
