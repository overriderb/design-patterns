package cdp.patterns.composite;

import java.math.BigDecimal;

/**
 * Manufacturer of camera components
 */
public class CameraManufacturer {

    public CameraComponent createCanonCameraBody() {
        CameraComponent body = new CameraPart("Body", "Camera body by Canon");
        body.add("Matrix", new CameraDetail("Matrix", "Camera matrix ASP-H", BigDecimal.valueOf(1100, 2)));
        body.add("Shutter", new CameraDetail("Shutter", "Canon shutter with life 200000 counts", BigDecimal.valueOf(240, 2)));
        CameraComponent housing = new CameraPart("Housing", "Camera housing");
        housing.add("Skeleton", new CameraDetail("Skeleton", "Metal frame for camera body", BigDecimal.valueOf(90, 2)));
        housing.add("Plastic", new CameraDetail("Plastic", "Plastic coating", BigDecimal.valueOf(120, 2)));
        body.add("Housing", housing);
        return body;
    }

    public CameraComponent createCanonCameraLens() {
        CameraComponent lens = new CameraPart("Lens", "Camera lens by Canon");
        lens.add("Glass", new CameraDetail("Glass", "Camera 11 group glass", BigDecimal.valueOf(800, 2)));
        lens.add("Switcher", new CameraDetail("Switcher", "Canon lens switcher Auto/Manual", BigDecimal.valueOf(150, 2)));
        return lens;
    }
}
