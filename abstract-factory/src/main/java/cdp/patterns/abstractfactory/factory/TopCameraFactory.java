package cdp.patterns.abstractfactory.factory;

import cdp.patterns.abstractfactory.camera.canon.Canon5DMark3Camera;
import cdp.patterns.abstractfactory.camera.canon.CanonCamera;
import cdp.patterns.abstractfactory.camera.nikon.NikonCamera;
import cdp.patterns.abstractfactory.camera.nikon.NikonD3XCamera;

/**
 * Create top technology and most expensive cameras of product line
 */
public class TopCameraFactory extends CameraFactory {

    @Override
    public CanonCamera createCanonCamera() {
        return new Canon5DMark3Camera();
    }

    @Override
    public NikonCamera createNikonCamera() {
        return new NikonD3XCamera();
    }
}
