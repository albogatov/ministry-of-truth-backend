package itmo.abogatov.ministryoftruthbackend.service;

import itmo.abogatov.ministryoftruthbackend.model.RuleEntity;
import itmo.abogatov.ministryoftruthbackend.transfer.RuleDto;

public interface RuleService {
    RuleEntity prepareEntity(RuleDto data);
    RuleDto prepareDto(RuleEntity entity);
}