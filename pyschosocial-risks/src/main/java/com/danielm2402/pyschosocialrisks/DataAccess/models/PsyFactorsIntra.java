package com.danielm2402.pyschosocialrisks.DataAccess.models;


import lombok.AllArgsConstructor;

import java.util.ArrayList;


public class PsyFactorsIntra extends AbstractQuestionnaire{

    public PsyFactorsIntra(String name, ArrayList<AQuestion> questions) {
        super(questions, name, 0);
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
