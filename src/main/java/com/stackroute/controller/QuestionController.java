package com.stackroute.controller;

import com.stackroute.domain.Questions;
import com.stackroute.exceptions.QuestionAlreadyExistsException;
import com.stackroute.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



//Main controller
@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/")
public class QuestionController {

    private QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }


    @PostMapping("question")
    public ResponseEntity<?> saveQuestions(@RequestBody Questions question) {
             System.out.println(question);
            try {
                Questions question1 = questionService.saveQuestion(question);
                return new ResponseEntity<Questions>(question1, HttpStatus.OK);
            }
            catch(QuestionAlreadyExistsException ex){
                return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
            }
//            catch (Exception exception) {
//                return new ResponseEntity<>(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//            }
    }
}
