//package edu.mum.cs544.d;
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
////        TypedQuery<edu.mum.cs544.d.Owner> query = em.createQuery("from Owner as o join fetch o.pets as p", edu.mum.cs544.d.Owner.class);
////        List<edu.mum.cs544.d.Owner> ownerlist = query.getResultList();
////        for (edu.mum.cs544.d.Owner o : ownerlist) {
////            o.getPets().size();
////        }
//
//        TypedQuery<edu.mum.cs544.d.Owner> query = em.createNamedQuery("Owner.get", Owner.class);
//        List<edu.mum.cs544.d.Owner> ownerlist = query.getResultList();
//        for (edu.mum.cs544.d.Owner o : ownerlist) {
//            o.getPets().size();
//        }
//
//        em.getTransaction().commit();
//        em.close();
//        long stop = System.nanoTime();
//
//        // stop time
//        System.out.println("To fetch this data from the database took " + (stop - start) / 1000000 + " milliseconds.");
//        // result:
//        // Query: 29055 milliseconds;
//        // Named Query: 30911 milliseconds;
//        System.exit(0);
//    }
//}
