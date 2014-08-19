package cdp.patterns.abstractfactory.store;

import cdp.patterns.abstractfactory.camera.canon.CanonCamera;
import cdp.patterns.abstractfactory.camera.nikon.NikonCamera;
import cdp.patterns.abstractfactory.factory.BudgetCameraFactory;
import cdp.patterns.abstractfactory.factory.CameraFactory;
import cdp.patterns.abstractfactory.factory.TopCameraFactory;

/**
 * Camera store where buyer can buy camera
 */
public class FooStore {

    /**
     * Buy Canon camera according to budget
     *
     * @param price of camera
     * @return Canon camera
     */
    public CanonCamera buyCanonCamera(int price) {
        CameraFactory factory = createFactory(price);
        return factory.createCanonCamera();
    }

    /**
     * Buy Nikon camera according to budget
     *
     * @param price of camera
     * @return Nikon camera
     */
    public NikonCamera buyNikonCamera(int price) {
        CameraFactory factory = createFactory(price);
        return factory.createNikonCamera();
    }

    private CameraFactory createFactory(int price) {
        CameraFactory factory;
        if (price < 700) {
            factory = new BudgetCameraFactory();
        } else {
            factory = new TopCameraFactory();
        }
        return factory;
    }
}
