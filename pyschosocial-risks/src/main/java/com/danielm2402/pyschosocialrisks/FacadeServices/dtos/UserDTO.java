package com.danielm2402.pyschosocialrisks.FacadeServices.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class UserDTO {
    private String id;
    private String name;
    private String city;
    private String maritalStatus;
    private String occupation;

    public UserDTO(){

    }
}
