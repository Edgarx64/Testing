package com.core.entity;

import javax.persistence.*;

@Entity
@Table(name = "Topics")
public class Topics {
    @Id
    @Column(name = "topic_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer topic_id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    public Topics(){

    }

    public Topics(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Integer getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(Integer topic_id) {
        this.topic_id = topic_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
