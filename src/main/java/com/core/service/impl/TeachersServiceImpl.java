package com.core.service.impl;

import com.core.persistence.dao.TeachersDao;
import com.core.entity.Teachers;
import com.core.service.TeachersService;

public class TeachersServiceImpl implements TeachersService {

    private TeachersDao teachersDao;

    public TeachersServiceImpl(TeachersDao teachersDao) {
        this.teachersDao = teachersDao;
    }

    @Override
    public void addTeacher(Teachers teachers) {
        teachersDao.save(teachers);
    }

    @Override
    public Teachers getTeacher(String login) {
        return teachersDao.getByLogin(login);
    }

    @Override
    public boolean isSuccessLogin(String login, String password) {
        return teachersDao.getPasswordByLogin(login).equals(password);
    }
}
