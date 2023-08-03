import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Author author = new Author();
        author.setAuthorId("A001");
        author.setName("mis.J. K. Rowling");
        author.setCountry("UK");
        author.setContactNo("011154532316");

        Book book1 = new Book();
        book1.setBookId("B001");
        book1.setTitle("Harry poter");
        book1.setPrice(1200.00);
        book1.setAuthor(author);

        Book book2 = new Book();
        book2.setBookId("B002");
        book2.setTitle("crime fiction");
        book2.setPrice(1250.00);
        book2.setAuthor(author);


        List<Book>books=new ArrayList<>();
        books.add(book1);
        books.add(book2);

        author.setBooks(books);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.persist(book1);
        session.persist(book2);
        session.persist(author);

        transaction.commit();
        session.close();

    }
}


