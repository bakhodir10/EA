package a;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Laptop {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    private Employee owner;


    public Laptop(String name, Employee owner) {
        this.name = name;
        this.owner = owner;
    }
}
