package cdp.patterns.abstractfactory.camera.nikon;

/**
 * Nikon camera
 */
public abstract class NikonCamera {

    String brand = "Nikon";

    public String getBrand() {
        return brand;
    }

    public abstract String getModel();
}
