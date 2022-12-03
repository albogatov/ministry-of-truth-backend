package itmo.abogatov.ministryoftruthbackend.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "employee", schema = "s312418", catalog = "studs")
public class EmployeeEntity {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    Integer id;
    @Column(name = "name", nullable = false)
    String name;
    @Column(name = "age")
    Integer age;
    @Column(name = "address")
    String address;
    @Column(name = "married")
    Boolean married;
    @Column(name = "children_amount")
    Integer childrenAmount;
    @Column(name = "notes")
    String notes;
    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    DepartmentEntity department;
    @ManyToOne
    @JoinColumn(name = "position_id", referencedColumnName = "id")
    PositionEntity position;
    @OneToOne
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    EmployeeProfileEntity employeeProfile;
}
