package cdp.patterns.chainofresponsibility.photogroup;

import cdp.patterns.chainofresponsibility.photoentity.PhotoPortfolio;
import cdp.patterns.chainofresponsibility.photoentity.PhotoType;

/**
 * TODO: Add class description
 */
public abstract class PhotoGroup {

    protected PhotoGroup photoGroup;

    public void setPhotoGroup(PhotoGroup photoGroup) {
        this.photoGroup = photoGroup;
    }

    public abstract PhotoPortfolio doPhotoSession(PhotoType photoType);
}
