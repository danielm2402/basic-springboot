package com.danielm2402.pyschosocialrisks.DataAccess.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;


@Getter @Setter @AllArgsConstructor
public abstract class AQuestion {
    protected String question;
    protected ArrayList<String> answers;
    protected String answer;

    protected abstract void addAnswer(String answer);

    public AQuestion(){

    }
}
