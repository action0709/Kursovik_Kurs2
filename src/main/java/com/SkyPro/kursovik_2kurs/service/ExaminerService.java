package com.SkyPro.kursovik_2kurs.service;

import com.SkyPro.kursovik_2kurs.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);

}
