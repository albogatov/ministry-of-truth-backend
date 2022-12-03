package itmo.abogatov.ministryoftruthbackend.transfer;

import itmo.abogatov.ministryoftruthbackend.model.DesignationEntity;
import itmo.abogatov.ministryoftruthbackend.model.MediaCategoryEntity;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class DepartmentDto implements Serializable {

    Integer id;
    String name;
    String status;
    Timestamp dateFoundation;
    Timestamp dateTermination;
    Integer designationId;
    Integer mediaCategoryId;

}
