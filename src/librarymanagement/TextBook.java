package librarymanagement;

public class TextBook extends Book {
    private String subject;

    public TextBook(int id, String title, String author, String subject) {
        super(id, title, author);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("TextBook ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
    }
}
