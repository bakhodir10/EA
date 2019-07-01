import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SecondaryTable;

@NoArgsConstructor
@Data
@SecondaryTable(name = "address")
@Entity
public class Patient {
    @Id
    private Long id;
    private String name;
    @JoinColumn(table = "address")
    private String street;
    @JoinColumn(table = "address")
    private String zip;
    @JoinColumn(table = "address")
    private String city;
}