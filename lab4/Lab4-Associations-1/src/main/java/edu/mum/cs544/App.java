package edu.mum.cs544;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

@SuppressWarnings("Duplicates")
public class App {

    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("cs544");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Owner owner = new Owner("Bakhodir", "4701 N O'conner Rd, Irving, TX 75062");
        Car car1 = new Car("BMW", "07/30/2017", 514000, owner);
        Car car2 = new Car("mercedes benz", "01/20/2019", 795000, owner);

        em.persist(car1);
        em.persist(car2);

        List<Car> cars = em.createQuery("from Car", Car.class).getResultList();
        cars.forEach(System.out::println);

        em.getTransaction().commit();
        em.close();

    }
}

