package itmo.abogatov.ministryoftruthbackend.service;

import itmo.abogatov.ministryoftruthbackend.model.DesignationEntity;
import itmo.abogatov.ministryoftruthbackend.transfer.DesignationDto;

public interface DesignationService {
    DesignationEntity prepareEntity(DesignationDto data);
    DesignationDto prepareDto(DesignationEntity entity);
}
