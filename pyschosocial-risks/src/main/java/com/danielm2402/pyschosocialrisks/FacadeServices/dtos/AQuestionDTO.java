package com.danielm2402.pyschosocialrisks.FacadeServices.dtos;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = QuestionDTO.class, name = "question"),
})
@Getter @Setter @AllArgsConstructor
public abstract class AQuestionDTO {
    protected String question;
    protected ArrayList<String> answers;
    protected String answer;
    public AQuestionDTO(){

    }
}
