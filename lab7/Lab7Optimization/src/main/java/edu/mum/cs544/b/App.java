//package edu.mum.cs544.b;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import javax.persistence.TypedQuery;
//import java.util.List;
//
//@SuppressWarnings("Duplicates")
//public class App {
//
//    private static EntityManagerFactory emf;
//
//    public static void main(String[] args) throws Exception {
//        emf = Persistence.createEntityManagerFactory("cs544");
//
//        long start = System.nanoTime();
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//
//        TypedQuery<edu.mum.cs544.b.Owner> query = em.createQuery("from Owner", edu.mum.cs544.b.Owner.class);
//        List<edu.mum.cs544.b.Owner> ownerlist = query.getResultList();
//        for (edu.mum.cs544.b.Owner o : ownerlist) {
//            o.getPets().size();
//        }
//
//        em.getTransaction().commit();
//        em.close();
//        long stop = System.nanoTime();
//
//        // stop time
//        System.out.println("To fetch this data from the database took " + (stop - start) / 1000000 + " milliseconds.");
//        // result: @BatchSize(size = 10) => 45127 milliseconds;
//        // @BatchSize(size = 5) => 52922 milliseconds
//        // @BatchSize(size = 50) => 38181 milliseconds
//        System.exit(0);
//    }
//}
