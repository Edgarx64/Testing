package com.core.entity;

import javax.persistence.*;

@Entity
@Table(name = "Students")
public class Students {
    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer student_id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    public Students(){

    }

    public Students(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
