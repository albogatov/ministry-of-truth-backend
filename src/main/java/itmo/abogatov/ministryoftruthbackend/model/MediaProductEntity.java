package itmo.abogatov.ministryoftruthbackend.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@JsonIdentityInfo(generator= ObjectIdGenerators.UUIDGenerator.class, property="@id")
@Entity
@Data
@Table(name = "media_product", schema = "s312418", catalog = "studs")
public class MediaProductEntity {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    Integer id;
    @Basic
    @Column(name = "title", nullable = false, columnDefinition = "VARCHAR(64) NOT NULL DEFAULT 'Unknown'")
    String title;
    @Basic
    @Column(name = "estimation")
    Integer estimation;
    @Basic
    @Column(name = "status", nullable = false, columnDefinition = "VARCHAR(32) NOT NULL  CHECK (STATUS IN ('Discovered', 'Processing', 'Redacted', 'Rereleased', 'Destroyed'))")
    String status;
    @ManyToOne
    @JoinColumn(name = "media_category_id", referencedColumnName = "id", insertable = false, updatable = false)
    MediaCategoryEntity mediaCategory;
    @ManyToOne
    @JoinColumn(name = "publisher_id", referencedColumnName = "id", insertable = false, updatable = false)
    PublisherEntity publisher;
    @OneToMany(mappedBy = "mediaId")
    Set<CaseMediaEntity> caseMediaEntities;

    @Column(name = "media_category_id")
    Integer mediaCategoryId;

    @Column(name = "publisher_id")
    Integer publisherId;
}
