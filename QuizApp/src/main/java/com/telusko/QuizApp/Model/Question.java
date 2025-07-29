package com.telusko.QuizApp.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String category;
    private String level;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    @Column(name = "question_title")
    private String questionTitle;

    @Column(name = "correct_answer")
    private String correctAnswer;


}
