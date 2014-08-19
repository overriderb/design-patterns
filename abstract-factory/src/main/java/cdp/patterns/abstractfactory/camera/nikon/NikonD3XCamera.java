package cdp.patterns.abstractfactory.camera.nikon;

/**
 * Top Nikon camera
 */
public class NikonD3XCamera extends NikonCamera {

    private String model = "D3X";

    @Override
    public String getModel() {
        return model;
    }
}
