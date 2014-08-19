package cdp.patterns.abstractfactory.camera.canon;

/**
 * Budget camera by canon
 */
public class Canon1000DCamera extends CanonCamera {

    private String model = "1000D";

    @Override
    public String getModel() {
        return model;
    }
}
