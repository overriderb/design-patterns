package cdp.patterns.chainofresponsibility;

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
