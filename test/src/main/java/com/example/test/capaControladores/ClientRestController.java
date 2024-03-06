package com.example.test.capaControladores;

import com.example.test.fachadaServices.DTO.ClienteDTO;
import com.example.test.fachadaServices.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientRestController {
    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public List<ClienteDTO> index(){
        return clienteService.findAll();
    }
}
