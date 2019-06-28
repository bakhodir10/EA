package c;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Map;

@NoArgsConstructor
@Data
@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    public School(String name) {
        this.name = name;
    }

    @OneToMany
    @MapKey(name = "id")
    private Map<Long, Student> students;
}
