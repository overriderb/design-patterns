package cdp.patterns.builder.manufacturer;

import cdp.patterns.builder.entity.Camera;
import cdp.patterns.builder.kitbuilder.CameraKitBuilder;

/**
 * In pattern meaning - director, in implementation meaning - manufacturer that construct camera kit
 */
public class Manufacturer {

    private CameraKitBuilder cameraKitBuilder;

    public Camera getCamera() {
        return cameraKitBuilder.getCamera();
    }

    public void constructCameraKit() {
        cameraKitBuilder.createCamera();
        cameraKitBuilder.buildCameraBody();
        cameraKitBuilder.buildCameraLens();
        cameraKitBuilder.buildCameraFlash();
    }

    public void setCameraKitBuilder(CameraKitBuilder cameraKitBuilder) {
        this.cameraKitBuilder = cameraKitBuilder;
    }
}
