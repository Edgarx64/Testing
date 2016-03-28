package com.core.persistence.dao;

import com.core.entity.Students;

public interface StudentsDao extends BaseDao<Students> {
    Students getByName(String name);
}
