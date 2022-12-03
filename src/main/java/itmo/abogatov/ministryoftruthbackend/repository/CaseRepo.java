package itmo.abogatov.ministryoftruthbackend.repository;

import itmo.abogatov.ministryoftruthbackend.model.CaseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaseRepo extends CrudRepository<CaseEntity, Integer> {
    @Override
    List<CaseEntity> findAll();
}
