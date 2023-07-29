package com.SkyPro.kursovik_2kurs.service;

import com.SkyPro.kursovik_2kurs.exception.QuestionAlreadyExistsException;
import com.SkyPro.kursovik_2kurs.exception.QuestionNotFoundException;
import com.SkyPro.kursovik_2kurs.exception.StorageEmptyException;
import com.SkyPro.kursovik_2kurs.model.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuestionServiceImpl implements QuestionService {

    private static final Random RANDOM = new Random();
    private Set<Question> questions = new HashSet<>();


    @Override
    public Question add(String question, String answer) {
        return add(new Question(question, answer));
    }

    @Override
    public Question remove(Question question) {
        if (questions.remove(question)) {
            return question;
        }
        throw new QuestionNotFoundException();

    }

    @Override
    public Question add(Question question) {
        if (questions.add(question)) {
            return question;
        }
        throw new QuestionAlreadyExistsException();
    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableSet(questions);
    }

    @Override
    public Question getRandomQuestion() {
        if (questions.isEmpty()) {
            throw new StorageEmptyException();
        }
        int index = RANDOM.nextInt(questions.size());
        return questions.stream()
                .skip(index)
                .findFirst()
                .orElseThrow(QuestionNotFoundException::new);
    }
}