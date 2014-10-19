package cdp.patterns.bridge.abstraction;

import cdp.patterns.bridge.exception.CameraPowerException;
import cdp.patterns.bridge.implementation.Camera;
import cdp.patterns.bridge.implementation.CanonCamera;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WirelessRemoteControllerTest {

    private WirelessRemoteController remoteController;

    @Before
    public void initialize() {
        remoteController = new WirelessRemoteController(new CanonCamera());
    }

    @Test
    public void testStart() throws Exception {
        CanonCamera camera = (CanonCamera) remoteController.getCamera();
        Assert.assertEquals(camera.isPowerOn(), false);
        remoteController.start();
        Assert.assertEquals(camera.isPowerOn(), true);
    }

    @Test(expected = CameraPowerException.class)
    public void testStartWhenCameraOn() throws Exception {
        CanonCamera camera = (CanonCamera) remoteController.getCamera();
        Assert.assertEquals(camera.isPowerOn(), false);
        remoteController.start();
        Assert.assertEquals(camera.isPowerOn(), true);
        remoteController.start();
    }

    @Test
    public void testStop() throws Exception {
        CanonCamera camera = (CanonCamera) remoteController.getCamera();
        Assert.assertEquals(camera.isPowerOn(), false);
        remoteController.start();
        Assert.assertEquals(camera.isPowerOn(), true);
        remoteController.stop();
        Assert.assertEquals(camera.isPowerOn(), false);
    }

    @Test(expected = CameraPowerException.class)
    public void testStopWhenCameraOff() throws Exception {
        CanonCamera camera = (CanonCamera) remoteController.getCamera();
        Assert.assertEquals(camera.isPowerOn(), false);
        remoteController.stop();
    }

    @Test
    public void testMakeCapture() throws Exception {
        CanonCamera camera = (CanonCamera) remoteController.getCamera();
        Assert.assertEquals(camera.getShutterCount(), 0);
        remoteController.makeCapture();
        Assert.assertEquals(camera.getShutterCount(), 1);
        remoteController.makeCapture();
        Assert.assertEquals(camera.getShutterCount(), 2);
    }

    @Test
    public void testFocus() throws Exception {
        CanonCamera camera = (CanonCamera) remoteController.getCamera();
        Assert.assertEquals(camera.isInFocus(), false);
        remoteController.focus();
        Assert.assertEquals(camera.isInFocus(), true);
    }
}