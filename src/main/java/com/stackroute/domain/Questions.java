package com.stackroute.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.Id;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Questions{
    @Id
    public double questionId;
    @Field
    private String questionTitle;
    @Field
    private String  questionDescription;
    @Field
    private String difficulty;
    @Field
    private String tags;
    @Field
    private String gitUrl;

    public double getQuestionId() {
        return questionId;
    }

    public void setQuestionId(double questionId) {
        this.questionId = questionId;
    }
}
