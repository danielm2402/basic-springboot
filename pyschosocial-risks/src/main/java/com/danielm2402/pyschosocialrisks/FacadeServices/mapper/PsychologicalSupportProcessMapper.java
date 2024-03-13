package com.danielm2402.pyschosocialrisks.FacadeServices.mapper;

import com.danielm2402.pyschosocialrisks.DataAccess.models.*;
import com.danielm2402.pyschosocialrisks.FacadeServices.dtos.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


import java.util.List;

@Mapper(componentModel = "spring")
public interface PsychologicalSupportProcessMapper {

    PsychologicalSupportProcess toEntity(PsychologicalSupportProcessDTO psp);
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

    default AbstractQuestionnaire map(AbstractQuestionnaireDTO questionnaire) {
        if (questionnaire instanceof PsyFactorsExtraDTO) {
            return map((PsyFactorsExtraDTO) questionnaire);
        } else if (questionnaire instanceof PsyFactorsIntraDTO) {
            return map((PsyFactorsIntraDTO) questionnaire);
        }
        return null;
    }
    PsyFactorsExtra map(PsyFactorsExtraDTO psyFactorsExtra);
    PsyFactorsIntra map(PsyFactorsIntraDTO psyFactorsIntra);

    default AQuestionDTO map(AQuestion question){
        return map((Question) question);
    }

    default AQuestion map(AQuestionDTO question){
        return map((QuestionDTO) question);
    }

    QuestionDTO map(Question question);
    Question map(QuestionDTO question);


}