package com.danielm2402.pyschosocialrisks.DataAccess.models;

import lombok.AllArgsConstructor;

import java.util.ArrayList;

public class Question extends AQuestion{
    public Question(String question, ArrayList<String> answers, String answer) {
        super(question, answers, answer);
    }

    @Override
    public void addAnswer(String answer) {
        this.answers.add(answer);
    }
}
