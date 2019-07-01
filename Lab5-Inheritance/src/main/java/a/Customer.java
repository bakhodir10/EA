package a;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Order> orders;

    public Customer(String firstName, String lastName, List<Order> orders) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.orders = orders;
    }
}
