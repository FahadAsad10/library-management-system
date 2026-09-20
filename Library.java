import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> catalog = new ArrayList<>();

    public void addBook(Book book) {
        catalog.add(book);
    }

    public boolean borrowBook(String isbn, Member member) {
        for (Book book : catalog) {
            if (book.getIsbn().equals(isbn) && !book.isBorrowed()) {
                book.setBorrowed(true);
                member.borrowBook(book);
                System.out.println(member.getName() + " borrowed \"" + book.getTitle() + "\"");
                return true;
            }
        }
        System.out.println("Book unavailable.");
        return false;
    }

    public boolean returnBook(String isbn, Member member) {
        for (Book book : member.getBorrowedBooks()) {
            if (book.getIsbn().equals(isbn)) {
                book.setBorrowed(false);
                member.returnBook(book);
                System.out.println(member.getName() + " returned \"" + book.getTitle() + "\"");
                return true;
            }
        }
        return false;
    }

    public void printCatalog() {
        for (Book book : catalog) {
            System.out.println(book);
        }
    }
}
