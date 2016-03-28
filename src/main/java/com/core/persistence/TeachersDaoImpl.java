package com.core.persistence;

import com.core.persistence.dao.TeachersDao;
import com.core.entity.Students;
import com.core.entity.Teachers;
import org.hibernate.Criteria;

import java.util.List;

public class TeachersDaoImpl extends BaseDaoImpl<Teachers> implements TeachersDao {
    @Override
    @SuppressWarnings("unchecked")
    public Teachers getByLogin(String login) {
        List<Teachers> students = getSession().createCriteria(Teachers.class).list();
        for (Teachers teach : students) {
            if (teach.getName().equals(login))
                return teach;
        }
        return null;
    }

    @Override
    public String getPasswordByLogin(String login) {
        List<Teachers> students = getSession().createCriteria(Teachers.class).list();
        for (Teachers teach : students) {
            if (teach.getName().equals(login))
                return teach.getPassword();
        }
        return null;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Teachers> getAll() {
        return sessionFactory.getCurrentSession()
                .createCriteria(Teachers.class)
                .list();
    }

    @Override
    public Teachers getById(int id) {
        return getSession().load(Teachers.class, id);
    }

    private Criteria createCriteria() {
        return getSession()
                .createCriteria(Students.class);
    }
}
