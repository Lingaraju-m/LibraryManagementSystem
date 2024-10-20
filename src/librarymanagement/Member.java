package librarymanagement;

public class Member extends User {

    public Member(String name, int userId) {
        super(name, userId);
    }

    @Override
    public void accessLibrary() {
        System.out.println("Member " + name + " is accessing the library.");
    }

    public void borrowBook(Book book) {
        System.out.println("Member " + name + " borrowed the book: " + book.getTitle());
    }

    public void returnBook(Book book) {
        System.out.println("Member " + name + " returned the book: " + book.getTitle());
    }
}
