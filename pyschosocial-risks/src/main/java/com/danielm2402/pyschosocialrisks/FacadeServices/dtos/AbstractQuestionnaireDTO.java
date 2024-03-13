package com.danielm2402.pyschosocialrisks.FacadeServices.dtos;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = PsyFactorsExtraDTO.class, name = "extra"),
        @JsonSubTypes.Type(value = PsyFactorsIntraDTO.class, name = "intra"),
})

@Getter @Setter @AllArgsConstructor
public abstract class AbstractQuestionnaireDTO {
    protected String name;
    protected Integer score;
    protected AbstractQuestionnaireDTO(){

    }
}
