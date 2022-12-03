package itmo.abogatov.ministryoftruthbackend.transfer;

import itmo.abogatov.ministryoftruthbackend.model.CaseDeviceEntity;
import itmo.abogatov.ministryoftruthbackend.model.EmployeeEntity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

@Data
public class DeviceDto implements Serializable {

    Integer id;
    String type;
    String model;
    Timestamp dateMade;
    Timestamp dateTerminated;
    Integer maintainerId;

}
