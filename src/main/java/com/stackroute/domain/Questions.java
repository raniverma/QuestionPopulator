package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Questions{
    @Id
    protected double questionId;
    private String questionTitle;
    private String  questionDescription;
    private String difficulty;
    private String tags;
    private String gitUrl;
}
