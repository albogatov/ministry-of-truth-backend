package itmo.abogatov.ministryoftruthbackend.transfer;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
public class EmployeeProfileDto implements Serializable {


    private Integer id;
    private String login;
    private String password;
    private String authToken;

}
