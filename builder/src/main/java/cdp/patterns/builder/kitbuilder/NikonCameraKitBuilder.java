package cdp.patterns.builder.kitbuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete builder for constructing Nikon camera kit
 */
public class NikonCameraKitBuilder extends CameraKitBuilder {

    @Override
    public void buildCameraBody() {
        camera.setBody("Nikon D3X");
    }

    @Override
    public void buildCameraLens() {
        List<String> lens = new ArrayList<String>();
        lens.add("Nikon AF-S Nikkor 24-70mm f/2.8G ED");
        lens.add("Nikon AI-S Nikkor 50mm f/1.2");
        camera.setLens(lens);
    }

    @Override
    public void buildCameraFlash() {
        camera.setFlash("Nikon Speedlight SB-910");
    }

}
