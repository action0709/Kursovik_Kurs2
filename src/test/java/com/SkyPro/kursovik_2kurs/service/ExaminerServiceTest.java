package com.SkyPro.kursovik_2kurs.service;

import com.SkyPro.kursovik_2kurs.model.Question;
import org.assertj.core.util.VisibleForTesting;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceTest {
    @Mock
    QuestionService questionService;
    @InjectMocks
    ExaminerServiceImpl examinerService;

    private List<Question> questions = List.of(
            new Question("hgf", "dxs"),
            new Question("lkj", "hgt"),
            new Question("btr", "luy")
    );

    @Test
    void getQuestions() {
        when(questionService.getAll()).thenReturn(questions);
        when(questionService.getRandomQuestion())
                .thenReturn(questions.get(2))
                .thenReturn(questions.get(2))
                .thenReturn(questions.get(0))
                .thenReturn(questions.get(1))
                .thenReturn(questions.get(0));
        Collection<Question> actual = examinerService.getQuestions(2);
        assertEquals(2, actual.size());
        assertTrue(questions.containsAll(actual));
    }
}
