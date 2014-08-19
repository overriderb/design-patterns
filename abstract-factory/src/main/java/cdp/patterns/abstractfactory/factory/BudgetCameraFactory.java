package cdp.patterns.abstractfactory.factory;

import cdp.patterns.abstractfactory.camera.canon.Canon1000DCamera;
import cdp.patterns.abstractfactory.camera.canon.CanonCamera;
import cdp.patterns.abstractfactory.camera.nikon.NikonCamera;
import cdp.patterns.abstractfactory.camera.nikon.NikonD40Camera;

/**
 * Create cheep and simple cameras
 */
public class BudgetCameraFactory extends CameraFactory {

    @Override
    public CanonCamera createCanonCamera() {
        return new Canon1000DCamera();
    }

    @Override
    public NikonCamera createNikonCamera() {
        return new NikonD40Camera();
    }
}
