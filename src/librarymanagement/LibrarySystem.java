package librarymanagement;

public class LibrarySystem {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();

        // Create an admin
        Admin admin = new Admin("Lingaraju", 1, library);

        // Create a textbook
        TextBook book1 = new TextBook(1, "Java Programming", "Author A", "Programming");
        TextBook book2 = new TextBook(2, "Data Structures", "Author B", "Computer Science");

        // Admin adds books
        admin.addBook(book1);
        admin.addBook(book2);

        // View all books
        admin.manageLibrary();

        // Update book
        TextBook updatedBook = new TextBook(1, "Advanced Java", "Author A", "Programming");
        admin.updateBook(updatedBook);

        // Delete a book
        admin.deleteBook(2);

        // View all books after deletion
        admin.manageLibrary();

        // Create a member
        Member member = new Member("Ashii", 2);
        member.accessLibrary();
        member.borrowBook(book1);
        member.returnBook(book1);
    }
}
