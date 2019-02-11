package com.stackroute.service;

import com.stackroute.domain.Questions;
import com.stackroute.exceptions.QuestionAlreadyExistsException;

public interface QuestionService {

    Questions saveQuestion(Questions question) throws QuestionAlreadyExistsException;

}
