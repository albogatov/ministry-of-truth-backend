package itmo.abogatov.ministryoftruthbackend.transfer;

import itmo.abogatov.ministryoftruthbackend.model.DepartmentEntity;
import itmo.abogatov.ministryoftruthbackend.model.EmployeeProfileEntity;
import itmo.abogatov.ministryoftruthbackend.model.PositionEntity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
public class EmployeeDto implements Serializable {


    Integer id;

    String name;

    Integer age;

    String address;

    Boolean married;

    Integer childrenAmount;

    String notes;

    Integer departmentId;

    Integer positionId;

    Integer employeeProfileId;

}
