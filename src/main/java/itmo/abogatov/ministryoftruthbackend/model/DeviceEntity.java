package itmo.abogatov.ministryoftruthbackend.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Data
@Table(name = "device", schema = "s312418", catalog = "studs")
public class DeviceEntity {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    Integer id;
    @Column(name = "type", nullable = false, columnDefinition = "VARCHAR(32) NOT NULL DEFAULT 'OTHER' CHECK (TYPE IN ('VIDEO_CAPTURE', 'AUDIO_CAPTURE', 'TEXT_CAPTURE', 'OTHER'))")
    String type;
    @Column(name = "model")
    String model;
    @Column(name = "date_made", nullable = false, columnDefinition = " TIMESTAMP NOT NULL DEFAULT CURRENT_DATE")
    Timestamp dateMade;
    @Column(name = "date_terminated")
    Timestamp dateTerminated;
    @OneToOne
    @JoinColumn(name = "maintainer_id", referencedColumnName = "id", insertable = false, updatable = false)
    EmployeeEntity maintainer;
    @Column(name = "maintainer_id")
    Integer maintainerId;
    @OneToMany(mappedBy = "deviceId")
    Set<CaseDeviceEntity> caseDeviceEntities;

}

