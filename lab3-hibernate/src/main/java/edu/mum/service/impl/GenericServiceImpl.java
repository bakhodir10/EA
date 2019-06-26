package edu.mum.service.impl;

import edu.mum.dao.GenericDao;
import edu.mum.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GenericServiceImpl<T> implements GenericService<T> {

    @Autowired
    private GenericDao<T> dao;

    @Override
    public void delete(T entity) {
        this.dao.delete(entity);
    }

    @Override
    public void delete(Long id) {
        this.dao.delete(id);
    }

    @Override
    public T findOne(Long id) {
        return this.dao.findOne(id);
    }

    @Override
    public T update(T entity) {
        return this.dao.update(entity);
    }

    @Override
    public void save(T entity) {
        this.dao.save(entity);
    }

    @Override
    public List<T> findAll() {
        return this.dao.findAll();
    }
}
