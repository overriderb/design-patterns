package cdp.patterns.abstractfactory.camera.nikon;

/**
 * Budget nikon camera
 */
public class NikonD40Camera extends NikonCamera {

    private String model = "D40";

    @Override
    public String getModel() {
        return model;
    }
}
