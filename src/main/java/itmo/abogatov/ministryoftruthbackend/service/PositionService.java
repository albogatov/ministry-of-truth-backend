package itmo.abogatov.ministryoftruthbackend.service;

import itmo.abogatov.ministryoftruthbackend.model.PositionEntity;
import itmo.abogatov.ministryoftruthbackend.transfer.PositionDto;

public interface PositionService {
    PositionEntity prepareEntity(PositionDto data);
    PositionDto prepareDto(PositionEntity entity);
}
