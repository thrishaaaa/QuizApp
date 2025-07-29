package com.telusko.QuizApp.Controller;

import com.telusko.QuizApp.Model.Question;
import com.telusko.QuizApp.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService = new QuestionService();

    @GetMapping("/getAllQuestions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }
}
