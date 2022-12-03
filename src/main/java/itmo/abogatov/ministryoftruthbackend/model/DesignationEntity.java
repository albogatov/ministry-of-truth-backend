package itmo.abogatov.ministryoftruthbackend.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "department_designation", schema = "s312418", catalog = "studs")
public class DesignationEntity {
    Integer id;
    String name;
    Integer expectedTarget;

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
    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "expected_target", nullable = false, columnDefinition = "INTEGER NOT NULL DEFAULT 0 CHECK (EXPECTED_TARGET >= 0)")
    public Integer getExpectedTarget() {
        return expectedTarget;
    }

    public void setExpectedTarget(Integer expectedTarget) {
        this.expectedTarget = expectedTarget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DesignationEntity that = (DesignationEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(name, that.name) && Objects.equals(expectedTarget, that.expectedTarget);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, expectedTarget);
    }
}
