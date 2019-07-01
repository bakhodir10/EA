package b;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@NoArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
public class CD extends Product {

    private String artist;

    public CD(String artist) {
        this.artist = artist;
    }

    public CD(String name, String description, String artist) {
        super(name, description);
        this.artist = artist;
    }
}
