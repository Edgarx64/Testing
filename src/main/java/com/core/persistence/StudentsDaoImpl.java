package com.core.persistence;

import com.core.persistence.dao.StudentsDao;
import com.core.entity.Students;
import org.hibernate.Criteria;

import java.util.List;

public class StudentsDaoImpl extends BaseDaoImpl<Students> implements StudentsDao {

    @Override
    @SuppressWarnings("unchecked")
    public Students getByName(String name) {
        List<Students> students = getSession().createCriteria(Students.class).list();
        for (Students stud : students) {
            if (stud.getName().equals(name))//.toLowerCase() .trim()
                return stud;
        }
        return null;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Students> getAll() {
        return sessionFactory.getCurrentSession()
                .createCriteria(Students.class)
                .list();
    }

    @Override
    public Students getById(int id) {
        return getSession().load(Students.class, id);
    }

    private Criteria createCriteria() {
        return getSession()
                .createCriteria(Students.class);
    }
}
