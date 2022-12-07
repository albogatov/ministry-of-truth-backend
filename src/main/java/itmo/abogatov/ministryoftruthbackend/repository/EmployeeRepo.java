package itmo.abogatov.ministryoftruthbackend.repository;

import itmo.abogatov.ministryoftruthbackend.model.EmployeeEntity;
import itmo.abogatov.ministryoftruthbackend.model.EmployeeProfileEntity;
import itmo.abogatov.ministryoftruthbackend.model.PositionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends CrudRepository<EmployeeEntity, Integer> {
    @Override
    List<EmployeeEntity> findAll();

    @Query(value = "select employee_closed_case_count(:id)", nativeQuery = true)
    Integer getStatsById(@Param("id") Integer id);

    EmployeeEntity findByEmployeeProfileId(Integer id);
}
