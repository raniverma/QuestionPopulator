package com.stackroute.config;


import com.stackroute.domain.Questions;
import com.stackroute.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationListner implements ApplicationListener<ApplicationReadyEvent>  {

    //    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    public ApplicationListner(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    @Override
     public void onApplicationEvent(final ApplicationReadyEvent applicationReadyEvent) {
        seedData();
     }

    public void seedData(){
        questionRepository.delete(new Questions(0,"Awesome" ,"Question1","Beginner","java","url"));
        questionRepository.delete(new Questions(1,"Awesome1" ,"Question2","Intermediate","java","url"));
        questionRepository.save(new Questions(0,"Awesome" ,"Question1","Beginner","java","url"));
        questionRepository.save(new Questions(1,"Awesome1" ,"Question2","Intermediate","java","url"));
    }
}
