package edu.mum.cs544.book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

@SuppressWarnings("Duplicates")
public class AppBook {
    private static EntityManagerFactory emf;

    public static void main(String[] args) throws Exception {
        emf = Persistence.createEntityManagerFactory("cs544");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        // Create new instance of book and set values in it
        Book book1 = new Book("Harry Potter", "12013", "J. K. Rowling", 35.00, new Date()
        );
        // save the book
        em.persist(book1);

        // Create new instance of Book and set values in it
        Book book2 = new Book("Thinking fast and slow", "11594", "Daniel Kahneman", 30.00, new Date()
        );
        // save the book
        em.persist(book2);

        // Create new instance of Book and set values in it
        Book book3 = new Book("Art of learning", "4198", "Josh Waitzkin", 33.00, new Date()
        );
        // save the book
        em.persist(book3);

        em.getTransaction().commit();
        em.close();

        em = emf.createEntityManager();
        em.getTransaction().begin();
        // retrieve all books
        TypedQuery<Book> query1 = em.createQuery("from Book ", Book.class);
        List<Book> bookList1 = query1.getResultList();
        for (Book book : bookList1) {
            System.out.println("name= " + book.getTitle() + ", author= "
                    + book.getAuthor() + ", price= " + book.getPrice());
        }

        em.getTransaction().commit();
        em.close();

        em = emf.createEntityManager();
        em.getTransaction().begin();

        TypedQuery<Book> query2 = em.createQuery("from Book ", Book.class);
        List<Book> bookList2 = query2.getResultList();
        for (Book book : bookList2) {
            if (book.getISBN().equals("12013")) {
                book.setTitle("The Selfish Gene");
                book.setPrice(40);
                em.persist(book);
            }
            if (book.getISBN().equals("11594")) {
                em.remove(book);
            }
        }

        em.getTransaction().commit();
        em.close();


        em = emf.createEntityManager();
        em.getTransaction().begin();
        // retrieve all books
        TypedQuery<Book> query3 = em.createQuery("from Book ", Book.class);
        List<Book> bookList3 = query3.getResultList();
        for (Book book : bookList3) {
            System.out.println("name= " + book.getTitle() + ", author= "
                    + book.getAuthor() + ", price= " + book.getPrice());
        }

        em.getTransaction().commit();
        em.close();
    }
}
