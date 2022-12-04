package itmo.abogatov.ministryoftruthbackend.repository;

import itmo.abogatov.ministryoftruthbackend.model.CaseEntity;
import itmo.abogatov.ministryoftruthbackend.model.CaseMediaEntity;
import itmo.abogatov.ministryoftruthbackend.model.MediaProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaseMediaRepo extends CrudRepository<CaseMediaEntity, Integer> {

    List<CaseMediaEntity> findAllByCaseId(Integer id);

    List<CaseMediaEntity> findAllByMediaId(Integer id);

}
