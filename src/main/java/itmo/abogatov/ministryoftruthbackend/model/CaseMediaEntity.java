package itmo.abogatov.ministryoftruthbackend.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@IdClass(CaseMediaEntityPK.class)
@Table(name = "case_media_relation", schema = "s312418", catalog = "studs")
public class CaseMediaEntity {

    @ManyToOne
    @JoinColumn(name = "media_id", referencedColumnName = "id")
    MediaProductEntity mediaProduct;
    @ManyToOne
    @JoinColumn(name = "case_id", referencedColumnName = "id")
    CaseEntity ministryCase;


}
