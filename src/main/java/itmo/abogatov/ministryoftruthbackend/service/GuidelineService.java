package itmo.abogatov.ministryoftruthbackend.service;

import itmo.abogatov.ministryoftruthbackend.model.GuidelineEntity;
import itmo.abogatov.ministryoftruthbackend.transfer.GuidelineDto;

public interface GuidelineService {
    GuidelineEntity prepareEntity(GuidelineDto data);
    GuidelineDto prepareDto(GuidelineEntity entity);
}
