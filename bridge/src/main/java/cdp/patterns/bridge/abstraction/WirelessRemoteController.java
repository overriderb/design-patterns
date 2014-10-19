package cdp.patterns.bridge.abstraction;

import cdp.patterns.bridge.exception.CameraPowerException;
import cdp.patterns.bridge.implementation.Camera;

/**
 * Wireless remote camera controller
 */
public class WirelessRemoteController implements CameraRemoteController {

    private Camera camera;

    public WirelessRemoteController(Camera camera) {
        this.camera = camera;
    }

    @Override
    public void start() throws CameraPowerException {
        camera.turnOn();
    }

    @Override
    public void stop() throws CameraPowerException {
        camera.turnOff();
    }

    @Override
    public void makeCapture() {
        camera.releaseShutter();
    }

    @Override
    public void focus() {
        camera.twistRing();
    }

    public Camera getCamera() {
        return camera;
    }
}
