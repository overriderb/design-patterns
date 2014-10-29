package cdp.patterns.chainofresponsibility.photogroup;

import cdp.patterns.chainofresponsibility.photoentity.PhotoPortfolio;
import cdp.patterns.chainofresponsibility.photoentity.PhotoType;

/**
 * TODO: Add class description
 */
public class WeddingPhotoGroup extends PhotoGroup {

    private static final String BODY = "Canon 5D Mark III";
    private static final String LENS = "Canon EF 28-70mm f/2.8 USM L";

    @Override
    public PhotoPortfolio doPhotoSession(PhotoType photoType) {
        PhotoPortfolio portfolio;
        if (photoType.equals(PhotoType.WEDDING)) {
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
        portfolio.setPhotoCount(6666);
        portfolio.setPhotoType(PhotoType.WEDDING);
        return portfolio;
    }
}
