package edu.mum.cs544.books;

import java.util.List;

public interface IBookDao {

    List<Book> getAll();

    void add(Book car);

    Book get(int id);

    void update(Book car);

    void delete(int carId);

}