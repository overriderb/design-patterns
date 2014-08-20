package cdp.patterns.builder.kitbuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete builder for constructing Canon camera kit
 */
public class CanonCameraKitBuilder extends CameraKitBuilder {

    @Override
    public void buildCameraBody() {
        camera.setBody("Canon 5D Mark III");
    }

    @Override
    public void buildCameraLens() {
        List<String> lens = new ArrayList<String>();
        lens.add("Canon EF 24-70 mm f/2.8 L");
        lens.add("Canon EF 50 mm f/1.2 L");
        lens.add("Canon EF 70-200 mm f/2.8 L");
        camera.setLens(lens);
    }

    @Override
    public void buildCameraFlash() {
        camera.setFlash("Canon Speedlite 580EX II");
    }
}
