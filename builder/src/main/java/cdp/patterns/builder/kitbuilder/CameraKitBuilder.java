package cdp.patterns.builder.kitbuilder;

import cdp.patterns.builder.entity.Camera;

/**
 * Abstract builder
 */
public abstract class CameraKitBuilder {

    protected Camera camera;

    public void createCamera() {
        camera = new Camera();
    }

    public Camera getCamera() {
        return camera;
    }

    public abstract void buildCameraBody();
    public abstract void buildCameraLens();
    public abstract void buildCameraFlash();
}