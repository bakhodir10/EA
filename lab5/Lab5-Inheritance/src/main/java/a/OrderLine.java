package a;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
public class OrderLine {

    @Id
    @GeneratedValue
    private Long id;

    private int quantity;

    @ManyToOne(cascade = CascadeType.ALL)
    private Product product;

    public OrderLine(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }
}
