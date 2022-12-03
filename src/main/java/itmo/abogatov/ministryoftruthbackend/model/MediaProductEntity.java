package itmo.abogatov.ministryoftruthbackend.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

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
    @JoinColumn(name = "media_category_id", referencedColumnName = "id")
    MediaCategoryEntity mediaCategory;
    @ManyToOne
    @JoinColumn(name = "publisher_id", referencedColumnName = "id")
    PublisherEntity publisher;
    @OneToMany(mappedBy = "media_product")
    Set<CaseMediaEntity> caseMediaEntities;
}
