package com.core.entity;

import javax.persistence.*;

@Entity
@Table(name = "Subscriptions_Students")
public class Subscriptions_Students {
    @Id
    @Column(name = "subscriptions_students_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer subscriptions_students_id;

    @ManyToOne(targetEntity = Topics.class)
    private Integer topic_id;

    @ManyToOne(targetEntity = Students.class)
    private Integer student_id;

    public Subscriptions_Students(){

    }

    public Subscriptions_Students(Integer topic_id, Integer student_id) {
        this.topic_id = topic_id;
        this.student_id = student_id;
    }

    public Integer getSubscriptions_students_id() {
        return subscriptions_students_id;
    }

    public void setSubscriptions_students_id(Integer subscriptions_students_id) {
        this.subscriptions_students_id = subscriptions_students_id;
    }

    public Integer getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(Integer topic_id) {
        this.topic_id = topic_id;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }
}
