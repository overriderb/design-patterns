package cdp.patterns.chainofresponsibility;

import cdp.patterns.chainofresponsibility.photoentity.PhotoPortfolio;
import cdp.patterns.chainofresponsibility.photoentity.PhotoType;
import cdp.patterns.chainofresponsibility.photogroup.MacroPhotoGroup;
import cdp.patterns.chainofresponsibility.photogroup.PhotoGroup;
import cdp.patterns.chainofresponsibility.photogroup.SportPhotoGroup;
import cdp.patterns.chainofresponsibility.photogroup.WeddingPhotoGroup;

/**
 * TODO: Add class description
 */
public class PhotoStudio {

    public PhotoPortfolio doMacroPhotoSession() {
        PhotoGroup photoGroupChain = createPhotoGroupChain();
        return photoGroupChain.doPhotoSession(PhotoType.MACRO);
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
