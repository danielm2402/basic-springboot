package com.danielm2402.pyschosocialrisks.FacadeServices.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Getter @Setter @AllArgsConstructor
public class PsychologicalSupportProcessDTO {
    protected String id;
    protected String name;
    protected Date date;
    protected UserDTO user;
    protected ArrayList<AbstractQuestionnaireDTO> questionnaires;

    public PsychologicalSupportProcessDTO() {

    }

}
