package com.danielm2402.pyschosocialrisks.DataAccess.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class User {
    private String id;
    private String name;
    private String city;
    private String maritalStatus;
    private String occupation;

    public User(){

    }
}
