package com.example.test.fachadaServices.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter @AllArgsConstructor
public class ClienteDTO {
    private Integer id;
    private String nombre;
    private String apellido;
    private String email;
    private Date createdAt;

    public ClienteDTO(){

    }
}
