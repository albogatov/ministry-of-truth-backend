package itmo.abogatov.ministryoftruthbackend.repository;

import itmo.abogatov.ministryoftruthbackend.model.CaseDeviceEntity;
import itmo.abogatov.ministryoftruthbackend.model.CaseMediaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaseDeviceRepo extends CrudRepository<CaseDeviceEntity, Integer> {

    List<CaseDeviceEntity> findAllByDeviceId(Integer id);

}
