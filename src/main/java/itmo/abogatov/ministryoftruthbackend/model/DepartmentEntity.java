package itmo.abogatov.ministryoftruthbackend.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Data
@Table(name = "department", schema = "s312418", catalog = "studs")
public class DepartmentEntity {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    Integer id;

    @Basic
    @Column(name = "name")
    String name;
    @Basic
    @Column(name = "status", nullable = false, columnDefinition = "VARCHAR(16) NOT NULL DEFAULT 'Suspended' CHECK (STATUS IN ('Active', 'Suspended', 'Terminated'))")
    String status;
    @Basic
    @Column(name = "date_foundation")
    Timestamp dateFoundation;
    @Basic
    @Column(name = "date_termination")
    Timestamp dateTermination;
    @ManyToOne
    @JoinColumn(name = "designation_id", referencedColumnName = "id", insertable = false, updatable = false)
    DesignationEntity designation;
    @ManyToOne
    @JoinColumn(name = "media_category_id", referencedColumnName = "id", insertable = false, updatable = false)
    MediaCategoryEntity mediaCategory;
    @Column(name = "designation_id")
    Integer designationId;
    @Column(name = "media_category_id")
    Integer mediaCategoryId;

}
