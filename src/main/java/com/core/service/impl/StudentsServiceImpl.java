package com.core.service.impl;

import com.core.persistence.dao.StudentsDao;
import com.core.entity.Students;
import com.core.service.StudentsService;

public class StudentsServiceImpl implements StudentsService {

    private StudentsDao studentsDao;

    public StudentsServiceImpl(StudentsDao studentsDao) {
        this.studentsDao = studentsDao;
    }

    @Override
    public void addStudent(Students students) {
        studentsDao.save(students);
    }
}
