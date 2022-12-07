package itmo.abogatov.ministryoftruthbackend.repository;

import itmo.abogatov.ministryoftruthbackend.model.DepartmentEntity;
import itmo.abogatov.ministryoftruthbackend.model.DesignationEntity;
import itmo.abogatov.ministryoftruthbackend.transfer.DepartmentDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepo extends CrudRepository<DepartmentEntity, Integer> {
    @Override
    List<DepartmentEntity> findAll();

    @Query(value = "select department_closed_case_count(:id)", nativeQuery = true)
    Integer getStatsById(@Param("id") Integer id);

    @Query(value = "select department_target_check(:id)", nativeQuery = true)
    boolean checkTarget(@Param("id") Integer id);

    @Query(value = "select dptmt_failed_target_count()", nativeQuery = true)
    Integer checkTargetFailed();
}
