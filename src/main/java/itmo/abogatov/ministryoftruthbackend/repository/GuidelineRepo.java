package itmo.abogatov.ministryoftruthbackend.repository;

import itmo.abogatov.ministryoftruthbackend.controllers.GuidelineController;
import itmo.abogatov.ministryoftruthbackend.model.CaseEntity;
import itmo.abogatov.ministryoftruthbackend.model.GuidelineEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuidelineRepo extends CrudRepository<GuidelineEntity, Integer> {
    @Override
    List<GuidelineEntity> findAll();
}
