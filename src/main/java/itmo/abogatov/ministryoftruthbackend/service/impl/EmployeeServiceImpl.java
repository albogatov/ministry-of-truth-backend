package itmo.abogatov.ministryoftruthbackend.service.impl;

import itmo.abogatov.ministryoftruthbackend.model.EmployeeEntity;
import itmo.abogatov.ministryoftruthbackend.service.EmployeeProfileService;
import itmo.abogatov.ministryoftruthbackend.service.EmployeeService;
import itmo.abogatov.ministryoftruthbackend.transfer.EmployeeDto;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Override
    public EmployeeEntity prepareEntity(EmployeeDto data) {
        EmployeeEntity employee = new EmployeeEntity();
        employee.setId(data.getId());
        employee.setAge(data.getAge());
        employee.setName(data.getName());
        employee.setAddress(data.getAddress());
        employee.setChildrenAmount(data.getChildrenAmount());
        employee.setNotes(data.getNotes());
        employee.setMarried(data.getMarried());
        employee.setEmployeeProfileId(data.getEmployeeProfileId());
        employee.setDepartmentId(data.getDepartmentId());
        employee.setPositionId(data.getPositionId());
        return employee;
    }

    @Override
    public EmployeeDto prepareDto(EmployeeEntity entity) {
        EmployeeDto employee = new EmployeeDto();
        employee.setId(entity.getId());
        employee.setAge(entity.getAge());
        employee.setName(entity.getName());
        employee.setAddress(entity.getAddress());
        employee.setChildrenAmount(entity.getChildrenAmount());
        employee.setNotes(entity.getNotes());
        employee.setMarried(entity.getMarried());
        employee.setEmployeeProfileId(entity.getEmployeeProfileId());
        employee.setDepartmentId(entity.getDepartmentId());
        employee.setPositionId(entity.getPositionId());
        return employee;
    }
}
