package com.example.demo.engine.quizadmin.repository;

import com.example.demo.engine.quizadmin.models.Quiz;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface QuizRepository extends Repository<Quiz, Long> {
    Quiz save(Quiz quiz);
    Optional<Quiz> findById(long id);
}
