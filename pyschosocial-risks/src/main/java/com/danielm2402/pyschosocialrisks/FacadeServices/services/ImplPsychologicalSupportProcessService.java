package com.danielm2402.pyschosocialrisks.FacadeServices.services;

import com.danielm2402.pyschosocialrisks.DataAccess.models.PsychologicalSupportProcess;
import com.danielm2402.pyschosocialrisks.DataAccess.repositories.QuestionnaireRepository;
import com.danielm2402.pyschosocialrisks.FacadeServices.dtos.PsychologicalSupportProcessDTO;
import com.danielm2402.pyschosocialrisks.FacadeServices.mapper.PsychologicalSupportProcessMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplPsychologicalSupportProcessService implements IPsychologicalSupportProcessService {
    @Autowired
    private QuestionnaireRepository questionnaireService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PsychologicalSupportProcessMapper psp;

    @Override
    public List<PsychologicalSupportProcessDTO> findAll() {
        List<PsychologicalSupportProcess> psychologicalSupportProcess = this.questionnaireService.findAll();
        List<PsychologicalSupportProcessDTO> psychologicalSupportProcessDTO = psp.toDtoList(psychologicalSupportProcess);
        return psychologicalSupportProcessDTO;
    }

    @Override
    public PsychologicalSupportProcessDTO create(PsychologicalSupportProcessDTO psp ) {
       PsychologicalSupportProcess psychologicalSupportProcess = this.psp.toEntity(psp);
       PsychologicalSupportProcess obj = this.questionnaireService.savePSP(psychologicalSupportProcess);
       PsychologicalSupportProcessDTO psychologicalSupportProcessDTO = this.psp.toDto(obj);
       return psychologicalSupportProcessDTO;
    }

    @Override
    public PsychologicalSupportProcessDTO update(String id, PsychologicalSupportProcessDTO psp) {
       return null;
    }

    @Override
    public Boolean delete(String id) {
        return this.questionnaireService.deletePSP(id);
    }

    @Override
    public PsychologicalSupportProcessDTO findById(String id) {
       return null;
    }


}
