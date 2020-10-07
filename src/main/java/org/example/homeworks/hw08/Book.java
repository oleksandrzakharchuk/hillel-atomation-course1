package org.example.homeworks.hw08;
import java.util.Objects;
import java.util.UUID;
public class Book {
    private String id;
    private String title = "";
    private Autor author;
    private String year = "";
    private String deskription = "";
    private String isbn = "";

    public Book() {
        id = UUID.randomUUID().toString();
    }

    public Book(String title, Autor author, String year,
                String deskription, String isbn) {
        this();
        this.title = title;
        this.author = author;
        this.year = year;
        this.deskription = deskription;
        this.isbn = isbn;
    }

    public Book(String title, Autor author) {
        this();
        this.title = title;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Autor getAuthor() {
        return author;
    }

    public void setAuthor(Autor author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDeskription() {
        return deskription;
    }

    public void setDeskription(String deskription) {
        this.deskription = deskription;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Book createCopy() {
        return new Book(title, author, year, deskription, isbn);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) &&
                author.equals(book.author) &&
                year.equals(book.year) &&
                deskription.equals(book.deskription) &&
                isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year, deskription, isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year='" + year + '\'' +
                ", deskription='" + deskription + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

}
