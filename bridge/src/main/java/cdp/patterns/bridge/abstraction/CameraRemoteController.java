package cdp.patterns.bridge.abstraction;

import cdp.patterns.bridge.exception.CameraPowerException;

/**
 * Abstract remote camera controller
 */
public interface CameraRemoteController {

    public void start() throws CameraPowerException;
    public void stop() throws CameraPowerException;
    public void makeCapture();
    public void focus();
}
