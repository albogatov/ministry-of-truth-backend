package itmo.abogatov.ministryoftruthbackend.repository;

import itmo.abogatov.ministryoftruthbackend.model.CaseEntity;
import itmo.abogatov.ministryoftruthbackend.model.GuidelineEntity;
import itmo.abogatov.ministryoftruthbackend.model.RuleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RuleRepo extends CrudRepository<RuleEntity, Integer> {

    List<RuleEntity> findAllByGuidelineId(Integer id);
}
