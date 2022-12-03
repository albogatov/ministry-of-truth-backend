package itmo.abogatov.ministryoftruthbackend.service;

import itmo.abogatov.ministryoftruthbackend.model.EmployeeProfileEntity;
import itmo.abogatov.ministryoftruthbackend.transfer.EmployeeProfileDto;

public interface EmployeeProfileService {


    EmployeeProfileEntity prepareEntity(EmployeeProfileDto data);
    EmployeeProfileDto prepareDto(EmployeeProfileEntity entity);
}
