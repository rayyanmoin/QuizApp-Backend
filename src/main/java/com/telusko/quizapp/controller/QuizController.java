package com.telusko.quizapp.controller;

import com.telusko.quizapp.model.*;
import com.telusko.quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {
    @Autowired
    QuizService quizService;
    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title){
        return quizService.createQuiz(category,numQ,title);
    }

    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions (@PathVariable Integer id){
       return quizService.getQuizQuestions(id);

    }

    @GetMapping("allQuiz")
    public ResponseEntity<List<Quiz>> getAllQuiz(){
        return quizService.getAllQuiz();
    }

    @GetMapping("allQuizScores")
    public ResponseEntity<List<QuizScore>> getAllQuizScore(){
        return quizService.getAllQuizScore();
    }

    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitQuiz (@PathVariable Integer id, @RequestBody List<Response> responses ){
        return quizService.calculateResult(id,responses);

    }




}
