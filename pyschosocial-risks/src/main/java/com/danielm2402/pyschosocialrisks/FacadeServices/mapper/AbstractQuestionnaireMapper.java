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
import org.mapstruct.MappingTarget;
import org.mapstruct.SubclassMapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AbstractQuestionnaireMapper {
    AbstractQuestionnaireMapper INSTANCE = Mappers.getMapper(AbstractQuestionnaireMapper.class);

    PsyFactorsExtraDTO mapToDto(PsyFactorsExtra source);

    PsyFactorsIntraDTO mapToDto(PsyFactorsIntra source);

}
