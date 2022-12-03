package itmo.abogatov.ministryoftruthbackend.service;

import itmo.abogatov.ministryoftruthbackend.model.CaseMediaEntity;
import itmo.abogatov.ministryoftruthbackend.transfer.CaseMediaDto;

public interface CaseMediaService {
    CaseMediaEntity prepareEntity(CaseMediaDto data);
    CaseMediaDto prepareDto(CaseMediaEntity entity);
}
