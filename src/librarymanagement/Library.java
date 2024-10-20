package librarymanagement;

import java.util.ArrayList;

public class Library implements CrudOperations<Book> {
    private ArrayList<Book> books = new ArrayList<>();

    @Override
    public void add(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    @Override
    public void update(Book updatedBook) {
        for (Book book : books) {
            if (book.getId() == updatedBook.getId()) {
                book.setTitle(updatedBook.getTitle());
                book.setAuthor(updatedBook.getAuthor());
                System.out.println("Book updated: " + updatedBook.getTitle());
                return;
            }
        }
        System.out.println("Book not found with ID: " + updatedBook.getId());
    }

    @Override
    public void delete(int id) {
        books.removeIf(book -> book.getId() == id);
        System.out.println("Book deleted with ID: " + id);
    }

    @Override
    public void view() {
        System.out.println("Books in the Library:");
        for (Book book : books) {
            book.displayDetails();
        }
    }
}
