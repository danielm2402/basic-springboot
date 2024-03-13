package com.danielm2402.pyschosocialrisks.FacadeServices.services;

import com.danielm2402.pyschosocialrisks.FacadeServices.dtos.PsychologicalSupportProcessDTO;

import java.util.List;

public interface IPsychologicalSupportProcessService {
    public List<PsychologicalSupportProcessDTO> findAll();
    public PsychologicalSupportProcessDTO create(PsychologicalSupportProcessDTO psp);

    public PsychologicalSupportProcessDTO update(String id, PsychologicalSupportProcessDTO psp);

    public Boolean delete(String id);

    public PsychologicalSupportProcessDTO findById(String id);

}
