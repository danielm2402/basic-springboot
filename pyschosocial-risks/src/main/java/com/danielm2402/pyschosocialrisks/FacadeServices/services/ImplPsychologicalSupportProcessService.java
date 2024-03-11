package com.danielm2402.pyschosocialrisks.FacadeServices.services;

import com.danielm2402.pyschosocialrisks.DataAccess.models.PsychologicalSupportProcess;
import com.danielm2402.pyschosocialrisks.DataAccess.repositories.QuestionnaireRepository;
import com.danielm2402.pyschosocialrisks.FacadeServices.dtos.PsychologicalSupportProcessDTO;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplPsychologicalSupportProcessService implements IPsychologicalSupportProcessService {
    @Autowired
    private QuestionnaireRepository questionnaireService;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<PsychologicalSupportProcessDTO> findAll() {
        List<PsychologicalSupportProcess> psychologicalSupportProcess = this.questionnaireService.findAll();
        List<PsychologicalSupportProcessDTO> psychologicalSupportProcessDTO = this.modelMapper.map(psychologicalSupportProcess,
                new TypeToken<List<PsychologicalSupportProcessDTO>>(){}.getType());
        return psychologicalSupportProcessDTO;
    }
}
