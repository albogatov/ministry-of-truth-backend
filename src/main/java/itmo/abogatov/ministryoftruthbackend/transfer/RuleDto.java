package itmo.abogatov.ministryoftruthbackend.transfer;

import itmo.abogatov.ministryoftruthbackend.model.GuidelineEntity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class RuleDto implements Serializable {


    Integer id;
    String description;
    Timestamp installmentDate;
    String punishment;
    Integer guidelineId;


}
