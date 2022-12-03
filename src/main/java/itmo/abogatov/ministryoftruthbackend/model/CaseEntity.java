package itmo.abogatov.ministryoftruthbackend.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "ministry_case", schema = "s312418", catalog = "studs")
public class CaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    Integer id;
    @Column(name = "state", nullable = false, columnDefinition = "VARCHAR(32) NOT NULL DEFAULT 'Submitted' CHECK (STATE IN ('Incomplete', 'Submitted',\n" +
            "  \t'Open',\n" +
            "  \t'In Progress',\n" +
            "  \t'Invalid',\n" +
            "  \t'Closed',\n" +
            "  \t'Reopened',\n" +
            "  \t'Frozen'))")
    String state;
    @OneToOne
    @JoinColumn(name = "assignee_id", referencedColumnName = "id")
    EmployeeEntity assignee;

    @OneToMany(mappedBy = "ministry_case")
    Set<CaseMediaEntity> caseMediaEntities;

    @OneToMany(mappedBy = "ministry_case")
    Set<CaseDeviceEntity> caseDeviceEntities;

}
