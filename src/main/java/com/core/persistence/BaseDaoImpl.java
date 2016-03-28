package com.core.persistence;

import com.core.persistence.dao.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class BaseDaoImpl<T> implements BaseDao<T> {
    @Autowired
    protected SessionFactory sessionFactory;

    @Override
    public void save(T t){
        getSession().save(t);
    }

    /*@Autowired
    public List<T> getAll(){

    }*/

    @Override
    public void addOrUpdate(T entityObj) {
        getSession().saveOrUpdate(entityObj);
    }

    @Override
    public void delete(T t){
        getSession().delete(t);
    }

    @Override
    public void update(T t){
        getSession().update(t);
    }

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
