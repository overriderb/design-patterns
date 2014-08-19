package cdp.patterns.abstractfactory.camera.canon;

/**
 * Canon camera
 */
public abstract class CanonCamera {

    public String brand = "Canon";

    public String getBrand() {
        return brand;
    }

    public abstract String getModel();
}
