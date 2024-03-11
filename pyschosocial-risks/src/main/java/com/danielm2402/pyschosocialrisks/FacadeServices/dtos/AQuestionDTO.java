package com.danielm2402.pyschosocialrisks.FacadeServices.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;


@Getter @Setter @AllArgsConstructor
public class AQuestionDTO {
    protected String question;
    protected ArrayList<String> answers;
    protected String answer;
    public AQuestionDTO(){

    }
}
