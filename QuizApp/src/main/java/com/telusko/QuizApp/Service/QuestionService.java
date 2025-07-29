package com.telusko.QuizApp.Service;

import com.telusko.QuizApp.Dao.QuestionDao;
import com.telusko.QuizApp.Model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }
}
