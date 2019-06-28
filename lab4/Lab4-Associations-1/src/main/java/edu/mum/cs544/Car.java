package edu.mum.cs544;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@Data
@ToString
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String brand;
    private String year;
    private double price;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Owner owner;

    public Car(String brand, String year, double price, Owner owner) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.owner = owner;
    }
}
