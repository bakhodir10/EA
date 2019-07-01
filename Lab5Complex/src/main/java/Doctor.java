import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@Entity
public class Doctor {
    @Id
    @GeneratedValue
    private Long id;
    private String doctortype;
    private String firstname;
    private String lastname;
}