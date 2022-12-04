package itmo.abogatov.ministryoftruthbackend.transfer;

import itmo.abogatov.ministryoftruthbackend.model.EmployeeEntity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
public class CaseDto implements Serializable {

    Integer id;

    String state;

    Integer assigneeId;

    String title;

    String description;
}
