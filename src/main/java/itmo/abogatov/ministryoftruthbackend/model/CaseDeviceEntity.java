package itmo.abogatov.ministryoftruthbackend.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@IdClass(CaseDeviceEntityPK.class)
@Table(name = "case_device_relation", schema = "s312418", catalog = "studs")
public class CaseDeviceEntity {

    @ManyToOne
    @JoinColumn(name = "device_id", referencedColumnName = "id")
    DeviceEntity device;
    @ManyToOne
    @JoinColumn(name = "case_id", referencedColumnName = "id")
    CaseEntity ministryCase;


}
