package cdp.patterns.chainofresponsibility;

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
