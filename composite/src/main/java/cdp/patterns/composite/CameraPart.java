package cdp.patterns.composite;

import java.util.HashMap;
import java.util.Map;

/**
 * Camera part consist of details
 */
public class CameraPart extends CameraComponent {

    private Map<String, CameraComponent> cameraComponents;
    private String name;
    private String description;

    public CameraPart(String name, String description) {
        this.name = name;
        this.description = description;
        this.cameraComponents = new HashMap<String, CameraComponent>();
    }

    public void add(String key, CameraComponent cameraComponent) {
        cameraComponents.put(key, cameraComponent);
    }

    public void remove(String key) {
        cameraComponents.remove(key);
    }

    public CameraComponent getComponent(String key) {
        return cameraComponents.get(key);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
