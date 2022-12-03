package itmo.abogatov.ministryoftruthbackend.transfer;

import lombok.Data;

import java.io.Serializable;

@Data
public class DesignationDto implements Serializable {

    Integer id;
    String name;
    Integer expectedTarget;
}
