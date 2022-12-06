package itmo.abogatov.ministryoftruthbackend.repository;

import itmo.abogatov.ministryoftruthbackend.model.DesignationEntity;
import itmo.abogatov.ministryoftruthbackend.model.PositionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PositionRepo extends CrudRepository<PositionEntity, Integer> {
    @Override
    List<PositionEntity> findAll();
}
