package b;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@Data
@Entity
public class OrderLine {

    @Id
    @GeneratedValue
    private Long id;

    private int quantity;

    @ManyToOne
    private Product product;
}
