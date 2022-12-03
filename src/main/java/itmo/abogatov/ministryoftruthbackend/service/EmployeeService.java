package itmo.abogatov.ministryoftruthbackend.service;

import itmo.abogatov.ministryoftruthbackend.model.EmployeeEntity;
import itmo.abogatov.ministryoftruthbackend.transfer.EmployeeDto;

public interface EmployeeService {
    EmployeeEntity prepareEntity(EmployeeDto data);
    EmployeeDto prepareDto(EmployeeEntity entity);
}
