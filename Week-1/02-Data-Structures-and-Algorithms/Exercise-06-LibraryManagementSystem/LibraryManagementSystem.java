import java.util.ArrayList;

public class LibraryManagementSystem {

    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book searchBook(int id) {
        for (Book book : books) {
            if (book.bookId == id)
                return book;
        }
        return null;
    }

    public void removeBook(int id) {
        books.removeIf(book -> book.bookId == id);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {

        LibraryManagementSystem library = new LibraryManagementSystem();

        library.addBook(new Book(101, "Java", "James Gosling"));
        library.addBook(new Book(102, "Python", "Guido van Rossum"));
        library.addBook(new Book(103, "C++", "Bjarne Stroustrup"));

        System.out.println("Books:");

        library.displayBooks();

        System.out.println("\nSearch:");

        System.out.println(library.searchBook(102));

        library.removeBook(102);

        System.out.println("\nAfter Remove:");

        library.displayBooks();
    }
}