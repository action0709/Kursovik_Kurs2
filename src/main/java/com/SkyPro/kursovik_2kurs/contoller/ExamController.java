package com.SkyPro.kursovik_2kurs.contoller;

import com.SkyPro.kursovik_2kurs.model.Question;
import com.SkyPro.kursovik_2kurs.service.ExaminerService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/get/{amount}")
    public Collection <Question> getQuestions(@PathVariable(name="amount")int amount){
        return examinerService.getQuestions(amount);
    }
}
