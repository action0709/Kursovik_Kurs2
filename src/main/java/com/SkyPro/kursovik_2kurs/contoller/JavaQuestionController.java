package com.SkyPro.kursovik_2kurs.contoller;

import com.SkyPro.kursovik_2kurs.model.Question;
import com.SkyPro.kursovik_2kurs.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {
    private final QuestionService questionService;

    public JavaQuestionController(QuestionService questionService) {

        this.questionService = questionService;
    }
    @GetMapping
    public Collection<Question> getAll()
    {
        return questionService.getAll();
    }

    @GetMapping("/add")
    public Question add (@RequestParam(name="question") String question,
                         @RequestParam(name="answer")String answer){
        return questionService.add(question, answer);
    }
    @GetMapping("/remove")
    public Question remove (@RequestParam(name="question")String question,
                            @RequestParam(name="answer")String answer){
        return questionService.remove(new Question(question, answer));
    }

}
