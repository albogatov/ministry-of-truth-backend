package itmo.abogatov.ministryoftruthbackend.service.impl;

import itmo.abogatov.ministryoftruthbackend.model.CaseEntity;
import itmo.abogatov.ministryoftruthbackend.service.CaseService;
import itmo.abogatov.ministryoftruthbackend.transfer.CaseDto;
import org.springframework.stereotype.Service;

@Service
public class CaseServiceImpl implements CaseService {

    @Override
    public CaseEntity prepareEntity(CaseDto data) {
        CaseEntity caseEntity = new CaseEntity();
        caseEntity.setId(data.getId());
        caseEntity.setState(data.getState());
        caseEntity.setAssigneeId(data.getAssigneeId());
        caseEntity.setDescription(data.getDescription());
        caseEntity.setTitle(data.getTitle());
        return caseEntity;
    }

    @Override
    public CaseDto prepareDto(CaseEntity entity) {
        CaseDto caseDto = new CaseDto();
        caseDto.setId(entity.getId());
        caseDto.setState(entity.getState());
        caseDto.setAssigneeId(entity.getAssigneeId());
        caseDto.setDescription(entity.getDescription());
        caseDto.setTitle(entity.getTitle());
        return caseDto;
    }
}
