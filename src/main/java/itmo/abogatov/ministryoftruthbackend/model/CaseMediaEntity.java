package itmo.abogatov.ministryoftruthbackend.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@IdClass(CaseMediaEntityPK.class)
@Table(name = "case_media_relation", schema = "s312418", catalog = "studs")
public class CaseMediaEntity {

    @Id
    @Column(name = "media_id")
    Integer mediaId;
    @Id
    @Column(name = "case_id")
    Integer caseId;
    @ManyToOne
    @JoinColumn(name = "media_id", referencedColumnName = "id", insertable = false, updatable = false)
    MediaProductEntity mediaProduct;
    @ManyToOne
    @JoinColumn(name = "case_id", referencedColumnName = "id", insertable = false, updatable = false)
    CaseEntity ministryCase;


}
