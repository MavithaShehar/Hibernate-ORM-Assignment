import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("A001", "mr.viliyam", "UK", "01113505322");
        Book book1 = new Book("B001", "Die hart", 1200.00, author1);

        Author author2 = new Author("A002", "mis.dayana", "USA", "01152222662");
        Book book2 = new Book("B002", "life of weliyam", 1000.00,author2);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.persist(author1);
        session.persist(book1);

        session.persist(author2);
        session.persist(book2);

        transaction.commit();

        session.close();
    }
}
