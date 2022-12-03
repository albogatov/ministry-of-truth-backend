package itmo.abogatov.ministryoftruthbackend.transfer;

import lombok.Data;

import java.io.Serializable;

@Data
public class MediaCategoryDto implements Serializable {

    Integer id;
    String name;
    String type;
    Integer yearlyQuota;

}
