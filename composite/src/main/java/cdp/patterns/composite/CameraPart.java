package cdp.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Camera part consist of details
 */
public class CameraPart extends CameraComponent {

    private List<CameraComponent> cameraComponents;
    private String name;
    private String description;

    public CameraPart(String name, String description) {
        this.name = name;
        this.description = description;
        this.cameraComponents = new ArrayList<CameraComponent>();
    }

    public void add(CameraComponent cameraComponent) {
        cameraComponents.add(cameraComponent);
    }

    public void remove(CameraComponent cameraComponent) {
        cameraComponents.remove(cameraComponent);
    }

    public CameraComponent getChild(int i) {
        return cameraComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
