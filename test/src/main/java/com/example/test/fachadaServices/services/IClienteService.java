package com.example.test.fachadaServices.services;

import com.example.test.fachadaServices.DTO.ClienteDTO;

import java.util.List;

public interface IClienteService {
    public List<ClienteDTO> findAll();
    public ClienteDTO findById(Integer id);
    public ClienteDTO save(ClienteDTO cliente);
    public ClienteDTO update(Integer id, ClienteDTO cliente);
}
