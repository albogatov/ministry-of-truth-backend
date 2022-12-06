package itmo.abogatov.ministryoftruthbackend.repository;

import itmo.abogatov.ministryoftruthbackend.model.DeviceEntity;
import itmo.abogatov.ministryoftruthbackend.model.MediaProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DeviceRepo extends CrudRepository<DeviceEntity, Integer> {

    @Override
    List<DeviceEntity> findAll();

    @Override
    Optional<DeviceEntity> findById(Integer id);

}
