package itmo.abogatov.ministryoftruthbackend.repository;

import itmo.abogatov.ministryoftruthbackend.model.CaseEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaseRepo extends CrudRepository<CaseEntity, Integer> {
    @Override
    List<CaseEntity> findAll();

    @Query(value = "call close_case_evidence_destroyed(:id)", nativeQuery = true)
    void closeCase(@Param("id") Integer id);
}
