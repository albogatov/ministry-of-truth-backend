package itmo.abogatov.ministryoftruthbackend.service.impl;

import itmo.abogatov.ministryoftruthbackend.model.RuleEntity;
import itmo.abogatov.ministryoftruthbackend.service.RuleService;
import itmo.abogatov.ministryoftruthbackend.transfer.RuleDto;
import org.springframework.stereotype.Service;

@Service
public class RuleServiceImpl implements RuleService {

    @Override
    public RuleEntity prepareEntity(RuleDto data) {
        RuleEntity rule = new RuleEntity();
        rule.setId(data.getId());
        rule.setDescription(data.getDescription());
        rule.setPunishment(data.getPunishment());
        rule.setInstallmentDate(data.getInstallmentDate());
        rule.setGuidelineId(data.getGuidelineId());
        return rule;
    }

    @Override
    public RuleDto prepareDto(RuleEntity entity) {
        RuleDto rule = new RuleDto();
        rule.setId(entity.getId());
        rule.setDescription(entity.getDescription());
        rule.setPunishment(entity.getPunishment());
        rule.setInstallmentDate(entity.getInstallmentDate());
        rule.setGuidelineId(entity.getGuidelineId());
        return rule;
    }
}
