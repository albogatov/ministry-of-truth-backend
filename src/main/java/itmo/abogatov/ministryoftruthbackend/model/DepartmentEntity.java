package itmo.abogatov.ministryoftruthbackend.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Data
@Table(name = "department", schema = "s312418", catalog = "studs")
public class DepartmentEntity {
    Integer id;
    String name;
    String status;
    Timestamp dateFoundation;
    Timestamp dateTermination;
    DesignationEntity designation;
    MediaCategoryEntity mediaCategory;
    @Id
    @Column(name = "designation_id")
    Integer designationId;
    @Id
    @Column(name = "media_category_id")
    Integer mediaCategoryId;

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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "status", nullable = false, columnDefinition = "VARCHAR(16) NOT NULL DEFAULT 'Suspended' CHECK (STATUS IN ('Active', 'Suspended', 'Terminated'))")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "date_foundation")
    public Timestamp getDateFoundation() {
        return dateFoundation;
    }

    public void setDateFoundation(Timestamp dateFoundation) {
        this.dateFoundation = dateFoundation;
    }

    @Basic
    @Column(name = "date_termination")
    public Timestamp getDateTermination() {
        return dateTermination;
    }

    public void setDateTermination(Timestamp dateTermination) {
        this.dateTermination = dateTermination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentEntity that = (DepartmentEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(dateFoundation, that.dateFoundation)
                && Objects.equals(dateTermination, that.dateTermination)
                && Objects.equals(status, that.status)
                && Objects.equals(mediaCategory, that.mediaCategory)
                && Objects.equals(designation, that.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateFoundation, status,
                mediaCategory, dateTermination, designation);
    }
}
