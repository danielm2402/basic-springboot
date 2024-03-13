package com.danielm2402.pyschosocialrisks.FacadeServices.dtos;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter @AllArgsConstructor
public class PsyFactorsIntraDTO extends AbstractQuestionnaireDTO{
    private String name;
    private Integer score;
    public PsyFactorsIntraDTO(){
    }
}
