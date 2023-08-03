import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author();
        author1.setAuthorId("A001");
        author1.setName("J. K. Rowling");
        author1.setEmail("J. K. Rowling@gmail.com");

        Author author2 = new Author();
        author2.setAuthorId("A002");
        author2.setName("william shakespeare");
        author2.setEmail("william shakespeare.com");

        Book book1 = new Book();
        book1.setBookId("B001");
        book1.setTitle("Harry poter");
        book1.setIsbn("B-000001");
        book1.setPrise(1250.00);

        Book book2 =new Book();
        book2.setBookId("B002");
        book2.setTitle("Romeo and Juliet");
        book2.setIsbn("B-0000002");
        book2.setPrise(1350.00);

        List<Author>authors = new ArrayList<>();
        authors.add(author1);
        authors.add(author2);


        List<Book>books = new ArrayList<>();

        books.add(book1);
        books.add(book2);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        book1.setAuthors(authors);
        book2.setAuthors(authors);

        author1.setBooks(books);
        author2.setBooks(books);

        session.persist(author1);
        session.persist(author2);

        session.persist(book1);
        session.persist(book2);

        transaction.commit();
        session.close();




    }


}
