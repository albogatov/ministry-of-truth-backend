package itmo.abogatov.ministryoftruthbackend.repository;

import itmo.abogatov.ministryoftruthbackend.model.CaseEntity;
import itmo.abogatov.ministryoftruthbackend.model.DesignationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DesignationRepo extends CrudRepository<DesignationEntity, Integer> {
    @Override
    List<DesignationEntity> findAll();
}
