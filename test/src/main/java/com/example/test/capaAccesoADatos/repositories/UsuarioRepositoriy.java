package com.example.test.capaAccesoADatos.repositories;

import com.example.test.capaAccesoADatos.models.ClienteEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class UsuarioRepositoriy {
    private ArrayList<ClienteEntity> listaDeClientes;

    public UsuarioRepositoriy(){
        this.listaDeClientes = new ArrayList<ClienteEntity>();
        cargarClientes();
    }

    public ArrayList<ClienteEntity> findAll(){
        return this.listaDeClientes;
    }

    public ClienteEntity findById(Integer id){
        ClienteEntity objCliente = null;
        for (ClienteEntity cliente: this.listaDeClientes){
            if (cliente.getId() == id){
                return cliente;
            }
        }
        return null;
    }

    public ClienteEntity save(ClienteEntity cliente){
        if (this.listaDeClientes.add(cliente)){
            return cliente;
        }
        return null;
    }

    public ClienteEntity update(Integer id, ClienteEntity cliente){
        for (int i=0; i < this.listaDeClientes.size();i++){
            if (this.listaDeClientes.get(i).getId() == id){
                this.listaDeClientes.set(id, cliente);
                return cliente;
            }
        }
        return null;
    }

    private void cargarClientes(){
        ClienteEntity objCliente1 = new ClienteEntity(1,"JUAN", "PEREZ", "juan@gmail.com", new Date());
        this.listaDeClientes.add(objCliente1);
        ClienteEntity objCliente2 = new ClienteEntity(1,"DANIEL", "PEREZ", "juan@gmail.com", new Date());
        this.listaDeClientes.add(objCliente2);
        ClienteEntity objCliente3 = new ClienteEntity(1,"ALEJANDRO", "PEREZ", "juan@gmail.com", new Date());
        this.listaDeClientes.add(objCliente3);
        ClienteEntity objCliente4 = new ClienteEntity(1,"ANDRÉS", "PEREZ", "juan@gmail.com", new Date());
        this.listaDeClientes.add(objCliente4);
    }

}
