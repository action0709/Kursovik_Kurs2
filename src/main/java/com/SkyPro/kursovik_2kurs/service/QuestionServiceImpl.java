package com.SkyPro.kursovik_2kurs.service;

import com.SkyPro.kursovik_2kurs.model.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class QuestionServiceImpl implements QuestionService {

    private Set<Question> questions = new HashSet<>();


    @Override
    public Question add(String question, String answer) {
        Question question1 = new Question( question, answer);
        questions.add(question1);
        return question1;
    }

    @Override
    public Question remove(Question question) {
        questions.remove(question);
        return question;
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return null;
    }

    @Override
    public Question getRandomQuestion() {
        return null;
    }
}
