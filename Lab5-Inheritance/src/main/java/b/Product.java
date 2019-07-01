package b;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;

}
