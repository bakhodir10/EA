package edu.mum.service;

import java.util.List;

public interface GenericService<T> {

    void delete(T entity);

    void delete(Long id);

    T findOne(Long id);

    T update(T entity);

    void save(T entity);

    List<T> findAll();
}
