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
        return caseEntity;
    }

    @Override
    public CaseDto prepareDto(CaseEntity entity) {
        CaseDto caseDto = new CaseDto();
        caseDto.setId(entity.getId());
        caseDto.setState(entity.getState());
        caseDto.setAssigneeId(entity.getAssigneeId());
        return caseDto;
    }
}
