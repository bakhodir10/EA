import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Eye doctor")
public class EyeDoctor extends Doctor {
}
