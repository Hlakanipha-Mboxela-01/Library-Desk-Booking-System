package models;

public class Book {
    private String id;
    private String title;
    private String author;
    private boolean checkedOut;

    // Getters and Setters

    public Book() {}

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.checkedOut = false;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public boolean isCheckedOut() { return checkedOut; }
    public void setCheckedOut(boolean checkedOut) { this.checkedOut = checkedOut; }
}
