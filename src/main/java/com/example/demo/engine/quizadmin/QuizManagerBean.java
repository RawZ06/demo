package com.example.demo.engine.quizadmin;

import com.example.demo.engine.quizadmin.models.Option;
import com.example.demo.engine.quizadmin.models.Question;
import com.example.demo.engine.quizadmin.models.Quiz;
import com.example.demo.engine.quizadmin.repository.OptionRepository;
import com.example.demo.engine.quizadmin.repository.QuestionRepository;
import com.example.demo.engine.quizadmin.repository.QuizRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class QuizManagerBean implements QuizManager {

    private final QuizRepository quizRepository;
    private final QuestionRepository questionRepository;
    private final OptionRepository optionRepository;

    public QuizManagerBean(QuizRepository quizRepository, QuestionRepository questionRepository, OptionRepository optionRepository) {
        this.quizRepository = quizRepository;
        this.questionRepository = questionRepository;
        this.optionRepository = optionRepository;
    }

    @Override
    public Quiz addQuiz(String name) {
        Quiz quiz = new Quiz();
        quiz.setName(name);
        return quiz;
    }

    @Override
    public Question addQuestion(int quizId, String question) {
        Optional<Quiz> quiz = this.quizRepository.findById(quizId);
        if (quiz.isPresent()) {
            Question newQuestion = new Question();
            newQuestion.setQuestion(question);
            newQuestion.setQuiz(quiz.get());
            return newQuestion;
        } else {
            throw new RuntimeException("Quiz not found");
        }
    }

    @Override
    public Option addOption(int questionId, String option, boolean isAnswer) {
        return null;
    }

    @Override
    public Quiz deleteQuiz(int quizId) {
        return null;
    }

    @Override
    public Question deleteQuestion(int questionId) {
        return null;
    }

    @Override
    public Option deleteOption(int optionId) {
        return null;
    }

    @Override
    public Quiz updateQuiz(int quizId, String name) {
        return null;
    }

    @Override
    public Question updateQuestion(int questionId, String question) {
        return null;
    }

    @Override
    public Option updateOption(int optionId, String option, boolean isAnswer) {
        return null;
    }
}
