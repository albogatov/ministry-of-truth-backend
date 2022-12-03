package itmo.abogatov.ministryoftruthbackend.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@IdClass(CaseDeviceEntityPK.class)
@Table(name = "case_device_relation", schema = "s312418", catalog = "studs")
public class CaseDeviceEntity {

    @Id
    @Column(name = "device_id")
    Integer deviceId;
    @Id
    @Column(name = "case_id")
    Integer caseId;
    @ManyToOne
    @JoinColumn(name = "device_id", referencedColumnName = "id", insertable = false, updatable = false)
    DeviceEntity device;
    @ManyToOne
    @JoinColumn(name = "case_id", referencedColumnName = "id", insertable = false, updatable = false)
    CaseEntity ministryCase;


}
