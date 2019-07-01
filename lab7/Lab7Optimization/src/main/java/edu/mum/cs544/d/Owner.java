//package edu.mum.cs544.d;//package edu.mum.cs544.b;
//
//import javax.persistence.*;
//import java.util.List;
//
//@NamedQueries(
//        @NamedQuery(name = "Owner.get", query = "from Owner as o join fetch o.pets as p")
//)
//@Entity
//public class Owner {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String name;
//    @OneToMany(cascade = {CascadeType.PERSIST})
//    @JoinColumn(name = "clientid")
//    private List<Pet> pets;
//
//    public Owner() {
//    }
//
//    public Owner(String name) {
//        super();
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public List<Pet> getPets() {
//        return pets;
//    }
//
//    public void setPets(List<Pet> pets) {
//        this.pets = pets;
//    }
//}
