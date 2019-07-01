//package edu.mum.cs544.e;//package edu.mum.cs544.b;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//public class Owner {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String name;
//    @OneToMany(cascade = {CascadeType.PERSIST})
//    @JoinColumn(name = "clientid")
//    private List<edu.mum.cs544.e.Pet> pets;
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
//    public List<edu.mum.cs544.e.Pet> getPets() {
//        return pets;
//    }
//
//    public void setPets(List<Pet> pets) {
//        this.pets = pets;
//    }
//}
