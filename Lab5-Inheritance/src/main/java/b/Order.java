package b;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@Data
@Entity
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "orderid")
    private Long logId;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne
    private OrderLine orderLine;
}
