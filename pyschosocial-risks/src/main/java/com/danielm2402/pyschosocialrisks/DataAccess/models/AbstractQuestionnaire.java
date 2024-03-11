package com.danielm2402.pyschosocialrisks.DataAccess.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter @AllArgsConstructor
public abstract class AbstractQuestionnaire {
    protected ArrayList <AQuestion> questions;
    protected String name;
    protected Integer score;

    protected abstract void addQuestion(AQuestion question);
    protected abstract void removeQuestion(Integer index);
}
