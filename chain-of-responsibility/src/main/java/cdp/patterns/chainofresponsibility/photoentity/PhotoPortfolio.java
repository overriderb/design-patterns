package cdp.patterns.chainofresponsibility.photoentity;

/**
 * TODO: Add comment
 */
public class PhotoPortfolio {

    private int photoCount;
    private String body;
    private String lens;
    private PhotoType photoType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhotoPortfolio that = (PhotoPortfolio) o;

        if (photoCount != that.photoCount) return false;
        if (body != null ? !body.equals(that.body) : that.body != null) return false;
        if (lens != null ? !lens.equals(that.lens) : that.lens != null) return false;
        if (photoType != that.photoType) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = photoCount;
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (lens != null ? lens.hashCode() : 0);
        result = 31 * result + (photoType != null ? photoType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PhotoPortfolio{" +
                "photoCount=" + photoCount +
                ", body='" + body + '\'' +
                ", lens='" + lens + '\'' +
                ", photoType=" + photoType +
                '}';
    }

    public void setPhotoCount(int photoCount) {
        this.photoCount = photoCount;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setLens(String lens) {
        this.lens = lens;
    }

    public void setPhotoType(PhotoType photoType) {
        this.photoType = photoType;
    }
}
