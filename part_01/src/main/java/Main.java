import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("B001", "Halo", "Mr.same");

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //create a book
        session.persist(book);

        //search book by ID
        Book book1 = session.get(Book.class, "B001");
        System.out.println(book1.getBookId());
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());

        //update the book
        book.setAuthor("Mr.Jhone");
        session.persist(book);

        System.out.println(book1.getBookId());
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());


        //delete a book
        session.remove(book);

        transaction.commit();

        session.close();

    }
}
