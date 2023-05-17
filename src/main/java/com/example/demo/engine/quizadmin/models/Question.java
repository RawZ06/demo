package com.example.demo.engine.quizadmin.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Question {
    @Id
    private long id;
    @Column
    private String question;
    @OneToMany
    private Set<Option> options;
    @ManyToOne
    private Quiz quiz;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Set<Option> getOptions() {
        return options;
    }

    public void setOptions(Set<Option> options) {
        this.options = options;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
}
