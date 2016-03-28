package com.console;

import com.core.entity.Students;
import com.core.service.impl.StudentsServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsoleRun {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath:applicationContext.xml"}, true);
        StudentsServiceImpl studentsServiceImpl = context.getBean("studensService", StudentsServiceImpl.class);
        studentsServiceImpl.addStudent(new Students("Petro", "email1"));
    }
}
