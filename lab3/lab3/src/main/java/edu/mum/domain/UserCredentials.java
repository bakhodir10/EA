package edu.mum.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "authentication")
public class UserCredentials {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER", nullable = false)
    private String username;

    @Column(name = "PASSWORD", nullable = false, length = 32)
    private String password;
    @Transient
    private String verifyPassword;

    private boolean enabled;
}
