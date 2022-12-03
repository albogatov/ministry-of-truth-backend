package itmo.abogatov.ministryoftruthbackend.model;

import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

@Data
public class CaseMediaEntityPK implements Serializable {

    @Column(name = "case_id", nullable = false)
    private Integer caseId;
    @Column(name = "media_id", nullable = false)
    private Integer mediaId;

}
