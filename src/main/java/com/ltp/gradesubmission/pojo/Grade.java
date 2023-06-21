package com.ltp.gradesubmission.pojo;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

import com.ltp.gradesubmission.validation.Score;

public class Grade {

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank(message = "Subject cannot be blank")
    private String subject;

    @Score(message = "Score must be 1-5")
    private String score;
    private String id;

    public Grade(String name, String subject, String score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
        this.id = UUID.randomUUID().toString();
    }

    public Grade() {
        this.id = UUID.randomUUID().toString();
    }

    public Grade(Grade source) {
        this.name = source.name;
        this.subject = source.subject;
        this.score = source.score;
        this.id = source.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
