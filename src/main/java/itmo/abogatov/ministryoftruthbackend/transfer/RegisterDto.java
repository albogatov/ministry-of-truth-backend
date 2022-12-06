package itmo.abogatov.ministryoftruthbackend.transfer;

import lombok.Data;

@Data
public class RegisterDto {
    EmployeeDto employeeDto;
    EmployeeProfileDto employeeProfileDto;
}
