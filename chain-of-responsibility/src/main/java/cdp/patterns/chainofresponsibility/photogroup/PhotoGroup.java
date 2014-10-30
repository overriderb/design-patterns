package cdp.patterns.chainofresponsibility.photogroup;

import cdp.patterns.chainofresponsibility.photoentity.PhotoPortfolio;
import cdp.patterns.chainofresponsibility.photoentity.PhotoType;

/**
 * Professional photo group prepared for certain type of photo sessions
 */
public abstract class PhotoGroup {

    protected PhotoGroup photoGroup;

    public void setPhotoGroup(PhotoGroup photoGroup) {
        this.photoGroup = photoGroup;
    }

    public abstract PhotoPortfolio doPhotoSession(PhotoType photoType);
}
