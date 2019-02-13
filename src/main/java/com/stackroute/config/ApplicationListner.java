package com.stackroute.config;


import com.stackroute.domain.Counters;
import com.stackroute.domain.Questions;
import com.stackroute.repository.CounterRepository;
import com.stackroute.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationListner implements ApplicationListener<ApplicationReadyEvent>  {

    //    @Autowired
    private QuestionRepository questionRepository;
    private CounterRepository counterRepository;


    @Autowired
    public ApplicationListner(QuestionRepository questionRepository, CounterRepository counterRepository) {
        this.questionRepository = questionRepository;
        this.counterRepository = counterRepository;
    }


    @Override
     public void onApplicationEvent(final ApplicationReadyEvent applicationReadyEvent) {
        seedData();
     }

    public void seedData(){
        //counterRepository.delete(new Counters("questionId",3));
        counterRepository.deleteAll();
        counterRepository.save(new Counters("questionId",3));
        questionRepository.deleteAll();
    //    questionRepository.delete(new Questions(0,"Awesome" ,"Question1","Beginner","java","url"));
      //  questionRepository.delete(new Questions(1,"Awesome1" ,"Question2","Intermediate","java","url"));
        questionRepository.save(new Questions(0,"Awesome" ,"Question1","input format","output Format","Beginner","java","url"));
        questionRepository.save(new Questions(1,"Awesome1" ,"Question2","input format","output Format","Intermediate","java","url"));
    }
}
