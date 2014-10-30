package cdp.patterns.chainofresponsibility;

import cdp.patterns.chainofresponsibility.photoentity.PhotoPortfolio;
import cdp.patterns.chainofresponsibility.photoentity.PhotoType;
import cdp.patterns.chainofresponsibility.photogroup.MacroPhotoGroup;
import cdp.patterns.chainofresponsibility.photogroup.PhotoGroup;
import cdp.patterns.chainofresponsibility.photogroup.SportPhotoGroup;
import cdp.patterns.chainofresponsibility.photogroup.WeddingPhotoGroup;

/**
 * Photo studio where client can request photo session of three type: Macro, Sport and Wedding.
 */
public class PhotoStudio {

    /**
     * Request macro photo session
     *
     * @return photo portfolio with macro photo, photo count and phototechnique description
     */
    public PhotoPortfolio doMacroPhotoSession() {
        PhotoGroup photoGroupChain = createPhotoGroupChain();
        return photoGroupChain.doPhotoSession(PhotoType.MACRO);
    }

    /**
     * Request sport photo session
     *
     * @return photo portfolio with sport photo, photo count and phototechnique description
     */
    public PhotoPortfolio doSportPhotoSession() {
        PhotoGroup photoGroupChain = createPhotoGroupChain();
        return photoGroupChain.doPhotoSession(PhotoType.SPORT);
    }

    /**
     * Request wedding photo session
     *
     * @return photo portfolio with wedding photo, photo count and phototechnique description
     */
    public PhotoPortfolio doWeddingPhotoSession() {
        PhotoGroup photoGroupChain = createPhotoGroupChain();
        return photoGroupChain.doPhotoSession(PhotoType.WEDDING);
    }

    private PhotoGroup createPhotoGroupChain() {
        PhotoGroup macroPhotoGroup = new MacroPhotoGroup();
        PhotoGroup sportPhotoGroup = new SportPhotoGroup();
        PhotoGroup weddingPhotoGroup = new WeddingPhotoGroup();
        sportPhotoGroup.setPhotoGroup(weddingPhotoGroup);
        macroPhotoGroup.setPhotoGroup(sportPhotoGroup);
        return macroPhotoGroup;
    }
}
