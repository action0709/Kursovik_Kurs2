package com.SkyPro.kursovik_2kurs.service;

import com.SkyPro.kursovik_2kurs.model.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;


public interface QuestionService {
    Question add(String question, String answer);

 Question remove(Question question);

    Question add(Question question);

    Collection<Question> getAll();

    Question getRandomQuestion();

}
