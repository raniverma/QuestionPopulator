package com.stackroute.repository;

import com.stackroute.domain.Questions;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface QuestionRepository extends MongoRepository<Questions, Integer> {

}
