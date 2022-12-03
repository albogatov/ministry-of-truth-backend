package itmo.abogatov.ministryoftruthbackend.transfer;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

@Data
public class CaseMediaDto implements Serializable {

    Integer mediaId;

    Integer caseId;
}
