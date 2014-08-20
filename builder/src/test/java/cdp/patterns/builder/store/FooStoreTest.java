package cdp.patterns.builder.store;

import cdp.patterns.builder.entity.Camera;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FooStoreTest {

    private static FooStore store;

    @BeforeClass
    public static void initializeVariables(){
        store = new FooStore();
    }

    @Test
    public void testBuyCanonCameraKit() throws Exception {
        Camera actualCameraKit = new Camera();
        actualCameraKit.setBody("Canon 5D Mark III");
        List<String> lens = new ArrayList<String>();
        lens.add("Canon EF 24-70 mm f/2.8 L");
        lens.add("Canon EF 50 mm f/1.2 L");
        lens.add("Canon EF 70-200 mm f/2.8 L");
        actualCameraKit.setLens(lens);
        actualCameraKit.setFlash("Canon Speedlite 580EX II");

        Camera expectedCameraKit = store.buyCanonCameraKit();

        assertNotNull(expectedCameraKit);
        assertEquals(expectedCameraKit.getBody(), actualCameraKit.getBody());
        assertEquals(expectedCameraKit.getLens(), actualCameraKit.getLens());
        assertEquals(expectedCameraKit.getFlash(), actualCameraKit.getFlash());
    }

    @Test
    public void testBuyNikonCameraKit() throws Exception {
        Camera actualCameraKit = new Camera();
        actualCameraKit.setBody("Nikon D3X");
        List<String> lens = new ArrayList<String>();
        lens.add("Nikon AF-S Nikkor 24-70mm f/2.8G ED");
        lens.add("Nikon AI-S Nikkor 50mm f/1.2");
        actualCameraKit.setLens(lens);
        actualCameraKit.setFlash("Nikon Speedlight SB-910");

        Camera expectedCameraKit = store.buyNikonCameraKit();

        assertNotNull(expectedCameraKit);
        assertEquals(expectedCameraKit.getBody(), actualCameraKit.getBody());
        assertEquals(expectedCameraKit.getLens(), actualCameraKit.getLens());
        assertEquals(expectedCameraKit.getFlash(), actualCameraKit.getFlash());
    }
}