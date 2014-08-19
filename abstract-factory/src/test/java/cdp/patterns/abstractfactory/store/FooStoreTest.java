package cdp.patterns.abstractfactory.store;

import cdp.patterns.abstractfactory.camera.canon.Canon1000DCamera;
import cdp.patterns.abstractfactory.camera.canon.Canon5DMark3Camera;
import cdp.patterns.abstractfactory.camera.canon.CanonCamera;
import cdp.patterns.abstractfactory.camera.nikon.NikonCamera;
import cdp.patterns.abstractfactory.camera.nikon.NikonD3XCamera;
import cdp.patterns.abstractfactory.camera.nikon.NikonD40Camera;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FooStoreTest {

    private static FooStore store;

    @BeforeClass
    public static void initializeVariables(){
        store = new FooStore();
    }

    @Test
    public void testBuyBudgetCanonCamera() throws Exception {
        CanonCamera actualCamera = new Canon1000DCamera();
        CanonCamera expectedCamera = store.buyCanonCamera(650);

        assertEquals(expectedCamera.getBrand(), actualCamera.getBrand());
        assertEquals(expectedCamera.getModel(), actualCamera.getModel());
    }

    @Test
    public void testBuyTopCanonCamera() throws Exception {
        CanonCamera actualCamera = new Canon5DMark3Camera();
        CanonCamera expectedCamera = store.buyCanonCamera(2500);

        assertEquals(expectedCamera.getBrand(), actualCamera.getBrand());
        assertEquals(expectedCamera.getModel(), actualCamera.getModel());
    }

    @Test
    public void testBuyBudgetNikonCamera() throws Exception {
        NikonCamera actualCamera = new NikonD40Camera();
        NikonCamera expectedCamera = store.buyNikonCamera(550);

        assertEquals(expectedCamera.getBrand(), actualCamera.getBrand());
        assertEquals(expectedCamera.getModel(), actualCamera.getModel());
    }

    @Test
    public void testBuyTopNikonCamera() throws Exception {
        NikonCamera actualCamera = new NikonD3XCamera();
        NikonCamera expectedCamera = store.buyNikonCamera(2000);

        assertEquals(expectedCamera.getBrand(), actualCamera.getBrand());
        assertEquals(expectedCamera.getModel(), actualCamera.getModel());
    }
}