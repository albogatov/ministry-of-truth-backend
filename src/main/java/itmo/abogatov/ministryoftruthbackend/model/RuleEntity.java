package itmo.abogatov.ministryoftruthbackend.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "rule", schema = "s312418", catalog = "studs")
public class RuleEntity {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    Integer id;
    @Column(name = "description", nullable = false)
    String description;
    @Column(name = "installment_date")
    Timestamp installmentDate;
    @Column(name = "punishment")
    String punishment;
    @ManyToOne
    @JoinColumn(name = "guideline_id", referencedColumnName = "id")
    GuidelineEntity guideline;
    @Id
    @Column(name = "guideline_id")
    Integer guidelineId;
}
