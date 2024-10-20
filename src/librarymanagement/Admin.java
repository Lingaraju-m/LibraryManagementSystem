package librarymanagement;

public class Admin extends User {
    private Library library;

    public Admin(String name, int userId, Library library) {
        super(name, userId);
        this.library = library;
    }

    @Override
    public void accessLibrary() {
        System.out.println("Admin accessing library...");
    }

    public void manageLibrary() {
        accessLibrary();
        library.view();
    }

    public void addBook(Book book) {
        library.add(book);
    }

    public void updateBook(Book book) {
        library.update(book);
    }

    public void deleteBook(int bookId) {
        library.delete(bookId);
    }
}
