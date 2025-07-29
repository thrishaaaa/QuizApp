package com.telusko.QuizApp.Dao;

import com.telusko.QuizApp.Model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionDao extends JpaRepository<Question, Integer> {
}
