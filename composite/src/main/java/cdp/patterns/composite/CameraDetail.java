package cdp.patterns.composite;

import java.math.BigDecimal;

/**
 * Small camera detail
 */
public class CameraDetail extends CameraComponent {

    private String name;
    private String description;
    private BigDecimal price;

    public CameraDetail(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
