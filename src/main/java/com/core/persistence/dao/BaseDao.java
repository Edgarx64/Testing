package com.core.persistence.dao;

import java.util.List;

public interface BaseDao<T> {
    void save(T t);
    List<T> getAll();
    T getById(int id);
    void delete(T t);
    void update(T t);
    public void addOrUpdate(T t);
}
