package com.danielm2402.pyschosocialrisks.Controllers;

import com.danielm2402.pyschosocialrisks.FacadeServices.dtos.PsychologicalSupportProcessDTO;
import com.danielm2402.pyschosocialrisks.FacadeServices.services.IPsychologicalSupportProcessService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PsychologicalSupportProcessController {
    @Autowired
    private IPsychologicalSupportProcessService psychologicalSupportProcessService;
    @GetMapping("/psychologicalsupportprocess")
    public List<PsychologicalSupportProcessDTO> index(){
        System.out.println("Test");
        return psychologicalSupportProcessService.findAll();
    }
}
