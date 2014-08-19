package cdp.patterns.abstractfactory.factory;

import cdp.patterns.abstractfactory.camera.canon.CanonCamera;
import cdp.patterns.abstractfactory.camera.nikon.NikonCamera;

/**
 * Create cameras of different brands
 */
public abstract class CameraFactory {

    public abstract CanonCamera createCanonCamera();
    public abstract NikonCamera createNikonCamera();
}
