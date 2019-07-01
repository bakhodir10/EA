import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
public class Appointment {
    @Id
    @GeneratedValue
    private Long id;
    private String appdate;
    @Embedded
    private Payment payment;
    @OneToOne
    private Patient patient;
    @OneToOne
    private Doctor doctor;
}