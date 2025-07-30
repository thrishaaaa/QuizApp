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

    public List<Question> getQuestionByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionDao.save(question);
        return "Question added successfully";
    }

    public String deleteById(int id) {
        questionDao.deleteById(id);
        return "Question deleted successfully";
    }
}
