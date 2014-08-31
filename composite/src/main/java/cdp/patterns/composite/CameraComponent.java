package cdp.patterns.composite;

import java.math.BigDecimal;

/**
 * Camera component which maybe a small detail or big camera part that consist of details
 */
public abstract class CameraComponent {

    public void add(String key, CameraComponent cameraComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(String key) {
        throw new UnsupportedOperationException();
    }

    public CameraComponent getComponent(String key) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public BigDecimal getPrice() {
        throw new UnsupportedOperationException();
    }
}
