public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("111", "Clean Code", "Robert Martin");
        Member fahad = new Member("Fahad", "M001");

        fahad.borrowBook(book1);
        book1.setBorrowed(true);

        System.out.println(fahad.getName() + " is holding:");
        for (Book b : fahad.getBorrowedBooks()) {
            System.out.println(" - " + b);
        }
    }
}
