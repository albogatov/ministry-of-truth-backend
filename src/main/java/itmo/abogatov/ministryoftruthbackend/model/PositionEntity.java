package itmo.abogatov.ministryoftruthbackend.model;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "position", schema = "s312418", catalog = "studs")
public class PositionEntity {
    Integer id;
    String name;
    Integer salary;
    Integer accessLevel;

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
    @Column(name = "salary", nullable = false, columnDefinition = "INTEGER NOT NULL DEFAULT 0 CHECK (SALARY >= 0)")
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Basic
    @Column(name = "access_level", nullable = false, columnDefinition = "INTEGER NOT NULL DEFAULT 1 CHECK (ACCESS_LEVEL >= 1 AND ACCESS_LEVEL <= 4)")
    public Integer getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionEntity that = (PositionEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(salary, that.salary) && Objects.equals(accessLevel, that.accessLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, accessLevel);
    }
}
