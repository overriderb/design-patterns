package cdp.patterns.composite;

import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CameraManufacturerTest {

    private static CameraManufacturer manufacturer;

    @BeforeClass
    public static void initializeVariables(){
        manufacturer = new CameraManufacturer();
    }

    @Test
    public void testCreateCanonCameraBody() throws Exception {
        CameraComponent body = manufacturer.createCanonCameraBody();
        assertNotNull(body);
        assertEquals("Body", body.getName());
        assertEquals("Camera body by Canon", body.getDescription());
        CameraComponent matrix = body.getComponent("Matrix");
        assertNotNull(matrix);
        assertEquals("Matrix", matrix.getName());
        assertEquals("Camera matrix ASP-H", matrix.getDescription());
        assertEquals(BigDecimal.valueOf(1100, 2), matrix.getPrice());
        CameraComponent shutter = body.getComponent("Shutter");
        assertNotNull(shutter);
        assertEquals("Shutter", shutter.getName());
        assertEquals("Canon shutter with life 200000 counts", shutter.getDescription());
        assertEquals(BigDecimal.valueOf(240, 2), shutter.getPrice());
        CameraComponent housing = body.getComponent("Housing");
        assertNotNull(housing);
        assertEquals("Housing", housing.getName());
        assertEquals("Camera housing", housing.getDescription());
        CameraComponent skeleton = housing.getComponent("Skeleton");
        assertNotNull(skeleton);
        assertEquals("Skeleton", skeleton.getName());
        assertEquals("Metal frame for camera body", skeleton.getDescription());
        assertEquals(BigDecimal.valueOf(90, 2), skeleton.getPrice());
        CameraComponent plastic = housing.getComponent("Plastic");
        assertNotNull(plastic);
        assertEquals("Plastic", plastic.getName());
        assertEquals("Plastic coating", plastic.getDescription());
        assertEquals(BigDecimal.valueOf(120, 2), plastic.getPrice());
    }

    @Test
    public void testCreateCanonCameraLens() throws Exception {
        CameraComponent lens = manufacturer.createCanonCameraLens();
        assertNotNull(lens);
        assertEquals("Lens", lens.getName());
        assertEquals("Camera lens by Canon", lens.getDescription());
        CameraComponent glass = lens.getComponent("Glass");
        assertNotNull(glass);
        assertEquals("Glass", glass.getName());
        assertEquals("Camera 11 group glass", glass.getDescription());
        assertEquals(BigDecimal.valueOf(800, 2), glass.getPrice());
        CameraComponent switcher = lens.getComponent("Switcher");
        assertNotNull(switcher);
        assertEquals("Switcher", switcher.getName());
        assertEquals("Canon lens switcher Auto/Manual", switcher.getDescription());
        assertEquals(BigDecimal.valueOf(150, 2), switcher.getPrice());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnsupportedOperation() throws Exception {
        CameraComponent body = manufacturer.createCanonCameraBody();
        assertNotNull(body);
        body.getComponent("Matrix").getComponent("Any component");
    }

    @Test
    public void testRemoveComponent() throws Exception {
        CameraComponent body = manufacturer.createCanonCameraBody();
        assertNotNull(body);
        assertNotNull(body.getComponent("Matrix"));
        body.remove("Matrix");
        assertNull(body.getComponent("Matrix"));
    }
}