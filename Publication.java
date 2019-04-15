package Publications;

public class Publication {
    public String title;
    public String authour;
    public float priceTag;
    public int pageNumber;


    @Override
    public String toString() {
        return "Pubblicazione{" +
                "Titolo='" + title + '\'' +
                ", Autore='" + authour + '\'' +
                ", Prezzo di copertina=" + priceTag +
                ", Pagine=" + pageNumber +
                '}';

    }

    public Publication(String title, String authour, float priceTag) {
        this.title = title;
        this.authour = authour;
        this.priceTag = priceTag;
        setPageNumber();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthour() {
        return authour;
    }

    public void setAuthour(String authour) {
        this.authour = authour;
    }

    public float getPriceTag() {
        return priceTag;
    }

    public void setPriceTag(int priceTag) {
        this.priceTag = priceTag;
        setPageNumber();
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber() {
        this.pageNumber = (int) (this.priceTag*10);
    }

}

