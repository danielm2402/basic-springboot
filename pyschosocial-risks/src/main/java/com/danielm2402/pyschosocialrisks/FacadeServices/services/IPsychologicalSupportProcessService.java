package com.danielm2402.pyschosocialrisks.FacadeServices.services;

import com.danielm2402.pyschosocialrisks.FacadeServices.dtos.PsychologicalSupportProcessDTO;

import java.util.List;

public interface IPsychologicalSupportProcessService {
    public List<PsychologicalSupportProcessDTO> findAll();

}
