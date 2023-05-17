package com.example.demo.engine.quizadmin;

import com.example.demo.engine.quizadmin.models.Option;
import com.example.demo.engine.quizadmin.models.Question;
import com.example.demo.engine.quizadmin.models.Quiz;

public interface QuizManager {
    Quiz addQuiz(String name);
    Question addQuestion(int quizId, String question);
    Option addOption(int questionId, String option, boolean isAnswer);
    Quiz deleteQuiz(int quizId);
    Question deleteQuestion(int questionId);
    Option deleteOption(int optionId);
    Quiz updateQuiz(int quizId, String name);
    Question updateQuestion(int questionId, String question);
    Option updateOption(int optionId, String option, boolean isAnswer);
}
