package cdp.patterns.abstractfactory.camera.canon;

/**
 * Top camera by canon
 */
public class Canon5DMark3Camera extends CanonCamera {

    private String model = "5DMark3";

    @Override
    public String getModel() {
        return model;
    }
}
