package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Book {

    @Id
    private String bookId;
    private String title;
    private String isbn;
    private double prise;

    @ManyToMany(mappedBy = "books")
    private List<Author>authors;

    public Book(String bookId, String title, String isbn, double prise, List<Author> authors) {
        this.bookId = bookId;
        this.title = title;
        this.isbn = isbn;
        this.prise = prise;
        this.authors = authors;
    }

    public Book() {
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
