package com.example.test.fachadaServices.services;

import com.example.test.capaAccesoADatos.repositories.UsuarioRepositoriy;
import com.example.test.fachadaServices.DTO.ClienteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private UsuarioRepositoriy servicioAccesoBaseDeDatos;
    @Override
    public List<ClienteDTO> findAll() {
        return null;
    }

    @Override
    public ClienteDTO findById(Integer id) {
        return null;
    }

    @Override
    public ClienteDTO save(ClienteDTO cliente) {
        return null;
    }

    @Override
    public ClienteDTO update(Integer id, ClienteDTO cliente) {
        return null;
    }
}
