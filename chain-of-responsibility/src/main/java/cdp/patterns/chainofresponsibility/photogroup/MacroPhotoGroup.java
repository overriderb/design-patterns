package cdp.patterns.chainofresponsibility.photogroup;

import cdp.patterns.chainofresponsibility.photoentity.PhotoPortfolio;
import cdp.patterns.chainofresponsibility.photoentity.PhotoType;

/**
 * Professional photo group prepared for macro photo sessions
 */
public class MacroPhotoGroup extends PhotoGroup {

    private static final String BODY = "Canon 1Ds Mark IV";
    private static final String LENS = "Canon EF 100mm f/2.8 IS USM L";

    @Override
    public PhotoPortfolio doPhotoSession(PhotoType photoType) {
        PhotoPortfolio portfolio;
        if (photoType.equals(PhotoType.MACRO)) {
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
        portfolio.setPhotoCount(50);
        portfolio.setPhotoType(PhotoType.MACRO);
        return portfolio;
    }
}
