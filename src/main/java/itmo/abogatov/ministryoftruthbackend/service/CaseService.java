package itmo.abogatov.ministryoftruthbackend.service;

import itmo.abogatov.ministryoftruthbackend.model.CaseEntity;
import itmo.abogatov.ministryoftruthbackend.transfer.CaseDto;

public interface CaseService {
    CaseEntity prepareEntity(CaseDto data);
    CaseDto prepareDto(CaseEntity entity);
}
