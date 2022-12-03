package itmo.abogatov.ministryoftruthbackend.transfer;

import itmo.abogatov.ministryoftruthbackend.model.DepartmentEntity;
import itmo.abogatov.ministryoftruthbackend.model.EmployeeEntity;
import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class GuidelineDto implements Serializable {


    Integer id;

    String name;
    Timestamp releaseDate;
    Integer newspeakVersion;
    Integer departmentId;
    Integer authorId;

}
