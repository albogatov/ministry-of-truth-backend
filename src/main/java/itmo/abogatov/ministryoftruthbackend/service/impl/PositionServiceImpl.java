package itmo.abogatov.ministryoftruthbackend.service.impl;

import itmo.abogatov.ministryoftruthbackend.model.PositionEntity;
import itmo.abogatov.ministryoftruthbackend.service.PositionService;
import itmo.abogatov.ministryoftruthbackend.transfer.PositionDto;
import org.springframework.stereotype.Service;

@Service
public class PositionServiceImpl implements PositionService {

    @Override
    public PositionEntity prepareEntity(PositionDto data) {
        PositionEntity position = new PositionEntity();
        position.setId(data.getId());
        position.setName(data.getName());
        position.setAccessLevel(data.getAccessLevel());
        position.setSalary(data.getSalary());
        return position;
    }

    @Override
    public PositionDto prepareDto(PositionEntity entity) {
        PositionDto position = new PositionDto();
        position.setId(entity.getId());
        position.setName(entity.getName());
        position.setAccessLevel(entity.getAccessLevel());
        position.setSalary(entity.getSalary());
        return position;
    }
}
