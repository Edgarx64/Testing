package com.core.persistence.dao;

import com.core.entity.Teachers;

public interface TeachersDao extends BaseDao<Teachers> {
    Teachers getByLogin(String login);
    String getPasswordByLogin(String login);
}
