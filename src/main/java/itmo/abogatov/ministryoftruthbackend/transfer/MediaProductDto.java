package itmo.abogatov.ministryoftruthbackend.transfer;

import itmo.abogatov.ministryoftruthbackend.model.CaseMediaEntity;
import itmo.abogatov.ministryoftruthbackend.model.MediaCategoryEntity;
import itmo.abogatov.ministryoftruthbackend.model.PublisherEntity;
import lombok.Data;
import org.springframework.data.relational.core.sql.In;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
public class MediaProductDto implements Serializable {


    Integer id;
    String title;
    Integer estimation;
    String status;
    Integer mediaCategoryId;
    Integer publisherId;

}
