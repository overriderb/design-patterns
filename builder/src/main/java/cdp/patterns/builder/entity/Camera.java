package cdp.patterns.builder.entity;

import java.util.List;

/**
 * Product:
 * Camera entity
 */
public class Camera {

    private String body;
    private List<String> lens;
    private String flash;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<String> getLens() {
        return lens;
    }

    public void setLens(List<String> lens) {
        this.lens = lens;
    }

    public String getFlash() {
        return flash;
    }

    public void setFlash(String flash) {
        this.flash = flash;
    }
}
