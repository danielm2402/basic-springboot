package com.danielm2402.pyschosocialrisks.FacadeServices.services;

import com.danielm2402.pyschosocialrisks.DataAccess.models.AbstractQuestionnaire;
import com.danielm2402.pyschosocialrisks.DataAccess.models.PsychologicalSupportProcess;
import com.danielm2402.pyschosocialrisks.DataAccess.repositories.QuestionnaireRepository;
import com.danielm2402.pyschosocialrisks.FacadeServices.dtos.PsychologicalSupportProcessDTO;
import com.danielm2402.pyschosocialrisks.FacadeServices.mapper.AbstractQuestionnaireMapper;
import com.danielm2402.pyschosocialrisks.FacadeServices.mapper.PsychologicalSupportProcessMapper;
import org.mapstruct.factory.Mappers;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ImplPsychologicalSupportProcessService implements IPsychologicalSupportProcessService {
    @Autowired
    private QuestionnaireRepository questionnaireService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PsychologicalSupportProcessMapper psp;

    @Autowired
    private AbstractQuestionnaireMapper abs;
    @Override
    public List<PsychologicalSupportProcessDTO> findAll() {
        List<PsychologicalSupportProcess> psychologicalSupportProcess = this.questionnaireService.findAll();
        List<PsychologicalSupportProcessDTO> psychologicalSupportProcessDTO = psp.toDtoList(psychologicalSupportProcess);
        return psychologicalSupportProcessDTO;
    }

    @Override
    public PsychologicalSupportProcessDTO create(@RequestBody PsychologicalSupportProcessDTO psp ) {

    return null;
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
