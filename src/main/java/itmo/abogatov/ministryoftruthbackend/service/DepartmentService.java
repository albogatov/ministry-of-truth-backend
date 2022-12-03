package itmo.abogatov.ministryoftruthbackend.service;

import itmo.abogatov.ministryoftruthbackend.model.DepartmentEntity;
import itmo.abogatov.ministryoftruthbackend.transfer.DepartmentDto;

public interface DepartmentService {
    DepartmentEntity prepareEntity(DepartmentDto data);
    DepartmentDto prepareDto(DepartmentEntity entity);
}