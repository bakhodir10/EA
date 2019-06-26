package edu.mum.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID", nullable = false)
    private Long id;

    @Column(name = "FIRSTNAME", nullable = false)
    private String firstName;

    @Column(name = "LASTNAME", nullable = false)
    private String lastName;

    @Column(name = "NAME", nullable = false)
    private String email;

    @Column(name = "RATING", nullable = false)
    private int rating = 0;

    @Column(name = "IS_ADMIN", nullable = false)
    private boolean admin = false;

    @Column(nullable = false)
    @Version
    private int version = 0;

    @Temporal(TemporalType.DATE)
    private Date lastLogin;

    public User(String firstName, String lastName, String email, int rating, boolean admin, int version, Date lastLogin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.rating = rating;
        this.admin = admin;
        this.version = version;
        this.lastLogin = lastLogin;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }
}