package cdp.patterns.chainofresponsibility;

import cdp.patterns.chainofresponsibility.photoentity.PhotoPortfolio;
import cdp.patterns.chainofresponsibility.photoentity.PhotoType;
import org.junit.Assert;
import org.junit.Test;

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

    @Test
    public void testDoSportPhotoSession() throws Exception {
        PhotoPortfolio expectedSportPhotoPortfolio = new PhotoPortfolio();
        expectedSportPhotoPortfolio.setPhotoCount(800);
        expectedSportPhotoPortfolio.setPhotoType(PhotoType.SPORT);
        expectedSportPhotoPortfolio.setBody("Canon 1D Mark IV");
        expectedSportPhotoPortfolio.setLens("Canon EF 70-200mm f/2.8 IS USM L");

        PhotoStudio photoStudio = new PhotoStudio();
        PhotoPortfolio actualSportPhotoPortfolio = photoStudio.doSportPhotoSession();

        Assert.assertEquals(expectedSportPhotoPortfolio, actualSportPhotoPortfolio);
    }

    @Test
    public void testDoWeddingPhotoSession() throws Exception {
        PhotoPortfolio expectedWeddingPhotoPortfolio = new PhotoPortfolio();
        expectedWeddingPhotoPortfolio.setPhotoCount(6666);
        expectedWeddingPhotoPortfolio.setPhotoType(PhotoType.WEDDING);
        expectedWeddingPhotoPortfolio.setBody("Canon 5D Mark III");
        expectedWeddingPhotoPortfolio.setLens("Canon EF 28-70mm f/2.8 USM L");

        PhotoStudio photoStudio = new PhotoStudio();
        PhotoPortfolio actualWeddingPhotoPortfolio = photoStudio.doWeddingPhotoSession();

        Assert.assertEquals(expectedWeddingPhotoPortfolio, actualWeddingPhotoPortfolio);
    }
}