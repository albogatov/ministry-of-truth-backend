package itmo.abogatov.ministryoftruthbackend.transfer;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class PublisherDto implements Serializable {

    Integer id;
    String name;
    Timestamp foundationDate;
    Integer employeesCount;
    String registrationCode;
    String representative;

}
