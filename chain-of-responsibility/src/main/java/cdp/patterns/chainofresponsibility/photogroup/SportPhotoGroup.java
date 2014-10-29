package cdp.patterns.chainofresponsibility.photogroup;

import cdp.patterns.chainofresponsibility.photoentity.PhotoPortfolio;
import cdp.patterns.chainofresponsibility.photoentity.PhotoType;

/**
 * TODO: Add class description
 */
public class SportPhotoGroup extends PhotoGroup {

    private static final String BODY = "Canon 1D Mark IV";
    private static final String LENS = "Canon EF 70-200mm f/2.8 IS USM L";

    @Override
    public PhotoPortfolio doPhotoSession(PhotoType photoType) {
        PhotoPortfolio portfolio;
        if (photoType.equals(PhotoType.SPORT)) {
            portfolio = doJob();
        } else {
            portfolio = photoGroup.doPhotoSession(photoType);
        }
        return portfolio;
    }

    private PhotoPortfolio doJob() {
        PhotoPortfolio portfolio = new PhotoPortfolio();
        portfolio.setBody(BODY);
        portfolio.setLens(LENS);
        portfolio.setPhotoCount(800);
        portfolio.setPhotoType(PhotoType.SPORT);
        return portfolio;
    }
}
