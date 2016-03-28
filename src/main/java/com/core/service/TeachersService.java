package com.core.service;

import com.core.entity.Teachers;

public interface TeachersService {
    void addTeacher(Teachers teachers);
    Teachers getTeacher(String login);
    boolean isSuccessLogin(String login, String password);
}
