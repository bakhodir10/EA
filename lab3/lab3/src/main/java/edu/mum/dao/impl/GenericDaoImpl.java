package edu.mum.dao.impl;

import edu.mum.dao.GenericDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@SuppressWarnings("unchecked")
@Repository
public abstract class GenericDaoImpl<T> implements GenericDao<T> {

    @PersistenceContext
    protected EntityManager entityManager;
    protected Class<T> daoType;

    public GenericDaoImpl(Class<T> daoType) {
        this.daoType = daoType;
    }

    @Override
    public void save(T entity) {
        entityManager.persist(entity);
    }

    public void delete(T entity) {
        entityManager.remove(entity);
    }

    @Override
    public void delete(Long id) {
        T entity = findOne(id);
        delete(entity);
    }

    @Override
    public T findOne(Long id) {
        return (T) entityManager.find(daoType, id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> findAll() {

        System.out.println(entityManager + "---" + daoType);

        return entityManager.createQuery("from " + daoType.getName())
                .getResultList();
    }

    @Override
    public T update(T entity) {
        return entityManager.merge(entity);
    }
}