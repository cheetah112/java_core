package model;

public class Book {
    private int id;
    private String name;
    private String author;
    private String subject;
    private int numberOfBook;

    public Book(int id, String name, String subject, String author, int numberOfBook) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.subject = subject;
        this.numberOfBook=numberOfBook;
    }

    public int getNumberOfBook() {
        return numberOfBook;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setNumberOfBook(int numberOfBook) {
        this.numberOfBook = numberOfBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", subject='" + subject + '\'' +
                ", numberOfBook=" + numberOfBook +
                '}';
    }
}
