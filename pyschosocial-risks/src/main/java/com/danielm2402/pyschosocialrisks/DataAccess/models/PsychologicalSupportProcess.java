package com.danielm2402.pyschosocialrisks.DataAccess.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Getter @Setter @AllArgsConstructor
public class PsychologicalSupportProcess {
    protected String id;
    protected String name;
    protected Date date;
    protected User user;
    protected ArrayList<AbstractQuestionnaire> questionnaires;

}
