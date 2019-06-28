import a.Employee;
import a.Laptop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cs544");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Employee employee = new Employee("Bakhodir");
        Laptop laptop = new Laptop("Acer", employee);
        em.persist(laptop);


        em.getTransaction().commit();
        em.close();
    }
}
