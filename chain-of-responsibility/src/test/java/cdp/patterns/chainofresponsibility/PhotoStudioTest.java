package cdp.patterns.chainofresponsibility;

import cdp.patterns.chainofresponsibility.photoentity.PhotoPortfolio;
import cdp.patterns.chainofresponsibility.photoentity.PhotoType;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhotoStudioTest {

    @Test
    public void testDoMacroPhotoSession() throws Exception {
        PhotoPortfolio expectedMacroPhotoPortfolio = new PhotoPortfolio();
        expectedMacroPhotoPortfolio.setPhotoCount(50);
        expectedMacroPhotoPortfolio.setPhotoType(PhotoType.MACRO);
        expectedMacroPhotoPortfolio.setBody("Canon 1Ds Mark IV");
        expectedMacroPhotoPortfolio.setLens("Canon EF 100mm f/2.8 IS USM L");

        PhotoStudio photoStudio = new PhotoStudio();
        PhotoPortfolio actualMacroPhotoPortfolio = photoStudio.doMacroPhotoSession();

        Assert.assertEquals(expectedMacroPhotoPortfolio, actualMacroPhotoPortfolio);
    }
}