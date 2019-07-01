import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class Payment {
    private String paydate;
    private double amount;
}