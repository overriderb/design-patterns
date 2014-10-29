package cdp.patterns.chainofresponsibility;

/**
 * TODO: Add class description
 */
public abstract class PhotoGroup {

    private PhotoGroup photoGroup;

    public void setPhotoGroup(PhotoGroup photoGroup) {
        this.photoGroup = photoGroup;
    }

    public abstract void makePhotoSession();
}
