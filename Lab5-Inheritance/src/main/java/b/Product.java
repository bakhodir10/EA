package b;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
