package b;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "orderid")
    private Long logId;

    @ManyToOne(cascade = CascadeType.ALL)
    private OrderLine orderLine;

    public Order(OrderLine orderLine) {
        this.orderLine = orderLine;
    }
}
