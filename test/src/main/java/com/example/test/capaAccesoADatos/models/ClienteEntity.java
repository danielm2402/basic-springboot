package com.example.test.capaAccesoADatos.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter @AllArgsConstructor
public class ClienteEntity {
    private Integer id;
    private String nombre;
    private String apellido;
    private String email;
    private Date createdAt;

    public ClienteEntity(){

    }
}
