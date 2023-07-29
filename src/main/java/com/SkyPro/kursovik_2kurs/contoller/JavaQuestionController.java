package com.SkyPro.kursovik_2kurs.contoller;

import com.SkyPro.kursovik_2kurs.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {
    private final QuestionService questionService;

    public JavaQuestionController(QuestionService questionService) {

        this.questionService = questionService;
    }

    @GetMapping("/add")
    public add(){
        questionService.add()
    }

}
