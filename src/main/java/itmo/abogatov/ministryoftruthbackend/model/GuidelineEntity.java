package itmo.abogatov.ministryoftruthbackend.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "guideline", schema = "s312418", catalog = "studs")
public class GuidelineEntity {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    Integer id;
    @Column(name = "name", nullable = false, columnDefinition = "VARCHAR(64) NOT NULL DEFAULT 'Untitled Dep. Guideline'")
    String name;
    @Column(name = "release_date", nullable = false, columnDefinition = " TIMESTAMP NOT NULL DEFAULT CURRENT_DATE")
    Timestamp releaseDate;
    @Column(name = "newspeak_version", columnDefinition = "INTEGER CHECK ( NEWSPEAK_VERSION IN (1, 2) )")
    Integer newspeakVersion;
    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "id", insertable = false, updatable = false)
    DepartmentEntity department;

    @Column(name = "department_id")
    Integer departmentId;
    @OneToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id", insertable = false, updatable = false)
    EmployeeEntity author;

    @Column(name = "author_id")
    Integer authorId;

}
