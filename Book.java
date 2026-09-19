public class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public boolean isBorrowed() { return isBorrowed; }
    public void setBorrowed(boolean borrowed) { this.isBorrowed = borrowed; }

    @Override
    public String toString() {
        return title + " by " + author + " [" + (isBorrowed ? "Borrowed" : "Available") + "]";
    }
}
