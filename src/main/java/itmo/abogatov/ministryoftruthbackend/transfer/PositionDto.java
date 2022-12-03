package itmo.abogatov.ministryoftruthbackend.transfer;

import lombok.Data;

import java.io.Serializable;

@Data
public class PositionDto implements Serializable {

    Integer id;
    String name;
    Integer salary;
    Integer accessLevel;

}
