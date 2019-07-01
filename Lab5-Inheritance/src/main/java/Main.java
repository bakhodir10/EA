import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cs544");

        EntityManager em = emf.createEntityManager();

//        Product product = new Product("Iphone xs", "Iphone xs");
//        OrderLine orderLine = new OrderLine(1, product);
//        Order order = new Order(orderLine);
//        List<Order> orders = new ArrayList<>();
//        orders.add(order);
//        Customer customer = new Customer("Bakhodir", "Boydedaev", orders);
//
//        em.getTransaction().begin();
//        em.persist(customer);
//
//        em.getTransaction().commit();
//        em.close();


//        CD cd = new CD("Chainsmoker");
//        OrderLine orderLine = new OrderLine(1, cd);
//        Order order = new Order(orderLine);
//        List<Order> orders = new ArrayList<>();
//        orders.add(order);
//        Customer customer = new Customer("Bakhodir", "Boydedaev", orders);
//
//        em.getTransaction().begin();
//        em.persist(customer);
//
//        em.getTransaction().commit();
//        em.close();
    }
}
