package itmo.abogatov.ministryoftruthbackend.model;

import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

@Data
public class CaseDeviceEntityPK implements Serializable {

    @Column(name = "case_id", nullable = false)
    private Integer caseId;
    @Column(name = "device_id", nullable = false)
    private Integer deviceId;


}
