package itmo.abogatov.ministryoftruthbackend.service.impl;

import itmo.abogatov.ministryoftruthbackend.model.DesignationEntity;
import itmo.abogatov.ministryoftruthbackend.service.DesignationService;
import itmo.abogatov.ministryoftruthbackend.transfer.DesignationDto;
import org.springframework.stereotype.Service;

@Service
public class DesignationServiceImpl implements DesignationService {

    @Override
    public DesignationEntity prepareEntity(DesignationDto data) {
        DesignationEntity designation = new DesignationEntity();
        designation.setId(data.getId());
        designation.setName(data.getName());
        designation.setExpectedTarget(data.getExpectedTarget());
        return designation;
    }

    @Override
    public DesignationDto prepareDto(DesignationEntity entity) {
        DesignationDto designation = new DesignationDto();
        designation.setId(entity.getId());
        designation.setName(entity.getName());
        designation.setExpectedTarget(entity.getExpectedTarget());
        return designation;
    }
}
