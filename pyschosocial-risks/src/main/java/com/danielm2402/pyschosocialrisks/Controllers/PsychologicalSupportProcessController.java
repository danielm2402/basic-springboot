package com.danielm2402.pyschosocialrisks.Controllers;

import com.danielm2402.pyschosocialrisks.FacadeServices.dtos.PsychologicalSupportProcessDTO;
import com.danielm2402.pyschosocialrisks.FacadeServices.services.IPsychologicalSupportProcessService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PsychologicalSupportProcessController {
    @Autowired
    private IPsychologicalSupportProcessService psychologicalSupportProcessService;
    @GetMapping("/psychologicalsupportprocess")
    public List<PsychologicalSupportProcessDTO> getPsychologicalSupportProcess(){
        System.out.println("Test");
        return psychologicalSupportProcessService.findAll();
    }
    @GetMapping("/psychologicalsupportprocess/{id}")
    public PsychologicalSupportProcessDTO getPsychologicalSupportProcessByID(@PathVariable String id){
        System.out.println("Test");
        return psychologicalSupportProcessService.findById(id);
    }
    @PostMapping("/psychologicalsupportprocess")
    public PsychologicalSupportProcessDTO PostPsychologicalSupportProcess (@RequestBody PsychologicalSupportProcessDTO psp){
        System.out.println("Testtttt"+ psp.getId());
        return psychologicalSupportProcessService.create(psp);
    }

}
