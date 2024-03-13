package com.danielm2402.pyschosocialrisks.FacadeServices.mapper;

import com.danielm2402.pyschosocialrisks.DataAccess.models.AbstractQuestionnaire;
import com.danielm2402.pyschosocialrisks.DataAccess.models.PsyFactorsExtra;
import com.danielm2402.pyschosocialrisks.DataAccess.models.PsyFactorsIntra;
import com.danielm2402.pyschosocialrisks.DataAccess.models.PsychologicalSupportProcess;
import com.danielm2402.pyschosocialrisks.FacadeServices.dtos.AbstractQuestionnaireDTO;
import com.danielm2402.pyschosocialrisks.FacadeServices.dtos.PsyFactorsExtraDTO;
import com.danielm2402.pyschosocialrisks.FacadeServices.dtos.PsyFactorsIntraDTO;
import com.danielm2402.pyschosocialrisks.FacadeServices.dtos.PsychologicalSupportProcessDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


import java.util.List;

@Mapper(componentModel = "spring")
public interface PsychologicalSupportProcessMapper {
    PsychologicalSupportProcessDTO toDto(PsychologicalSupportProcess psp);

    List<PsychologicalSupportProcessDTO> toDtoList(List<PsychologicalSupportProcess> psp);

    default AbstractQuestionnaireDTO map(AbstractQuestionnaire questionnaire) {
        if (questionnaire instanceof PsyFactorsExtra) {
            return map((PsyFactorsExtra) questionnaire);
        } else if (questionnaire instanceof PsyFactorsIntra) {
            return map((PsyFactorsIntra) questionnaire);
        }
        return null;
    }

    PsyFactorsExtraDTO map(PsyFactorsExtra psyFactorsExtra);
    PsyFactorsIntraDTO map(PsyFactorsIntra psyFactorsIntra);
}