package com.danielm2402.pyschosocialrisks.DataAccess.models;

import lombok.AllArgsConstructor;

import java.util.ArrayList;

public class Stress extends AbstractQuestionnaire{

    public Stress(ArrayList<AQuestion> questions, String name, Integer score) {
        super(questions, name, score);
    }

    @Override
    public void addQuestion(AQuestion question) {
        this.questions.add(question);
    }

    @Override
    public void removeQuestion(Integer index) {
        this.questions.remove(index);
    }
}
