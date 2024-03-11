package com.danielm2402.pyschosocialrisks.FacadeServices.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter @AllArgsConstructor
public class AbstractQuestionnaireDTO {
    protected ArrayList <AQuestionDTO> questions;
    protected String name;
    protected Integer score;

    public AbstractQuestionnaireDTO(){

    }
}
