package cdp.patterns.builder.store;

import cdp.patterns.builder.manufacturer.Manufacturer;
import cdp.patterns.builder.entity.Camera;
import cdp.patterns.builder.kitbuilder.CanonCameraKitBuilder;
import cdp.patterns.builder.kitbuilder.NikonCameraKitBuilder;

/**
 * Camera store where buyer can buy camera kit
 */
public class FooStore {

    private Manufacturer manufacturer;

    public FooStore() {
        manufacturer = new Manufacturer();
    }

    /**
     * Buy Canon camera Kit
     *
     * @return canon camera kit
     */
    public Camera buyCanonCameraKit() {
        manufacturer.setCameraKitBuilder(new CanonCameraKitBuilder());
        manufacturer.constructCameraKit();

        return manufacturer.getCamera();
    }

    /**
     * Buy Nikon camera Kit
     *
     * @return nikon camera kit
     */
    public Camera buyNikonCameraKit() {
        manufacturer.setCameraKitBuilder(new NikonCameraKitBuilder());
        manufacturer.constructCameraKit();

        return manufacturer.getCamera();
    }
}