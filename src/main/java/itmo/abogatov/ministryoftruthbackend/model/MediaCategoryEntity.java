package itmo.abogatov.ministryoftruthbackend.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "media_category", schema = "s312418", catalog = "studs")
public class MediaCategoryEntity {
    Integer id;
    String name;
    String type;
    Integer yearlyQuota;

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
    @Column(name = "type", nullable = false, columnDefinition = " VARCHAR(16) CHECK (TYPE IN ('AUDIO', 'VIDEO', 'TEXT', 'OTHER'))")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "yearly_quota", nullable = false, columnDefinition = " INTEGER CHECK (YEARLY_QUOTA > 0)")
    public Integer getYearlyQuota() {
        return this.yearlyQuota;
    }

    public void setYearlyQuota(Integer yearlyQuota) {
        this.yearlyQuota = yearlyQuota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MediaCategoryEntity that = (MediaCategoryEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(type, that.type) && Objects.equals(yearlyQuota, that.yearlyQuota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, yearlyQuota);
    }
}
