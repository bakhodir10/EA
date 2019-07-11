package edu.mum.cs544.books;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookDao extends JpaRepository<Book, Long> {

}