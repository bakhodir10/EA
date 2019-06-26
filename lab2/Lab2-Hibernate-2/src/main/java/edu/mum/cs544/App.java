package edu.mum.cs544;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

@SuppressWarnings("Duplicates")
public class App {
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("simpsons");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em = emf.createEntityManager();
        em.getTransaction().begin();

        TypedQuery<Student> query1 = em.createQuery("from Student ", Student.class);
        List<Student> studentList1 = query1.getResultList();
        for (Student student : studentList1) {
            System.out.println("name= " + student.getName() + ", email= "
                    + student.getEmail());
        }

        em.getTransaction().commit();
        em.close();

        em = emf.createEntityManager();
        em.getTransaction().begin();

        // Create new instance of student and set values in it
        Student student1 = new Student("Bakhodir", "bboydedaev@mum.edu", "10");
        // save the student
        em.persist(student1);

        em.getTransaction().commit();
        em.close();

        em = emf.createEntityManager();
        em.getTransaction().begin();

        TypedQuery<Student> query2 = em.createQuery("from Student ", Student.class);
        List<Student> studentList2 = query2.getResultList();
        for (Student student : studentList2) {
            System.out.println("name= " + student.getName() + ", email= "
                    + student.getEmail());
        }

        em.getTransaction().commit();
        em.close();
    }
}
