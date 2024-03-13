package com.danielm2402.pyschosocialrisks.FacadeServices.dtos;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
    @JsonDeserialize(contentAs = AbstractQuestionnaireDTO.class)
    protected ArrayList<AbstractQuestionnaireDTO> questionnaires;

    public PsychologicalSupportProcessDTO() {

    }

}
