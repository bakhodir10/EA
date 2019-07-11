package edu.mum.cs544.books;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
