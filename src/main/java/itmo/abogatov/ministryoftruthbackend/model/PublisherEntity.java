package itmo.abogatov.ministryoftruthbackend.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "publisher", schema = "s312418", catalog = "studs")
public class PublisherEntity {
    Integer id;
    String name;
    Timestamp foundationDate;
    Integer employeesCount;
    String registrationCode;
    String representative;

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, columnDefinition = "VARCHAR(32) NOT NULL DEFAULT 'Undesignated org'")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "foundation_date")
    public Timestamp getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(Timestamp foundationDate) {
        this.foundationDate = foundationDate;
    }

    @Basic
    @Column(name = "employees_count", nullable = false, columnDefinition = "INTEGER NOT NULL DEFAULT 1 CHECK (EMPLOYEES_COUNT >= 0)")
    public Integer getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(Integer employeesCount) {
        this.employeesCount = employeesCount;
    }

    @Basic
    @Column(name = "registration_code", nullable = false, columnDefinition = "VARCHAR(64) NOT NULL DEFAULT 'Awaiting police data'")
    public String getRegistrationCode() {
        return registrationCode;
    }

    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode;
    }

    @Basic
    @Column(name = "representative", nullable = false, columnDefinition = "VARCHAR(64) NOT NULL DEFAULT 'Awaiting police data'")
    public String getRepresentative() {
        return representative;
    }

    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublisherEntity that = (PublisherEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(employeesCount, that.employeesCount) && Objects.equals(registrationCode, that.registrationCode) && Objects.equals(representative, that.representative);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employeesCount, registrationCode, representative);
    }
}
