public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("111", "Clean Code", "Robert Martin"));
        library.addBook(new Book("222", "The Pragmatic Programmer", "Andy Hunt"));

        Member fahad = new Member("Fahad", "M001");

        System.out.println("Catalog:");
        library.printCatalog();

        System.out.println("\nBorrowing...");
        library.borrowBook("111", fahad);

        System.out.println("\nCatalog after borrowing:");
        library.printCatalog();

        System.out.println("\nReturning...");
        library.returnBook("111", fahad);

        System.out.println("\nCatalog after returning:");
        library.printCatalog();
    }
}
