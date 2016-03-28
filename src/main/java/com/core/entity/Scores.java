package com.core.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Scores")
public class Scores {
    @Id
    @Column(name = "score_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long score_id;

    @ManyToOne(targetEntity = Topics.class)
    private Long topic_id;

    @ManyToOne(targetEntity = Students.class)
    private long student_id;

    @Column(name = "score")
    private Long score;

    @Column(name = "date", columnDefinition = "DATETIME")
    private Date date;

    public Scores(){

    }

    public Scores(Long topic_id, Long student_id, Long score, Date date) {
        this.topic_id = topic_id;
        this.student_id = student_id;
        this.score = score;
        this.date = date;
    }

    public Long getScore_id() {
        return score_id;
    }

    public void setScore_id(Long  score_id) {
        this.score_id = score_id;
    }

    public Long  getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(Long  topic_id) {
        this.topic_id = topic_id;
    }

    public Long  getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long  student_id) {
        this.student_id = student_id;
    }

    public Long  getScore() {
        return score;
    }

    public void setScore(Long  score) {
        this.score = score;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
