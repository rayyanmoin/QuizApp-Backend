package com.telusko.quizapp.dao;

import com.telusko.quizapp.model.Quiz;
import com.telusko.quizapp.model.QuizScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ScoreDao extends JpaRepository<QuizScore,Integer>{


}
