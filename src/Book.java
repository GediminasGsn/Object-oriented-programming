public class Book {
    private String title;
    private int pages;
    private int releaseYear;

    public Book(){

    }
    public Book(String title, int pages, int releaseYear) {
        this.title = title;
        this.pages = pages;
        this.releaseYear = releaseYear;

    }


    public String getTitle() {
        return title;
    }


    public int getPages() {
        return pages;
    }


    public int getReleaseYear() {
        return releaseYear;
    }

}
