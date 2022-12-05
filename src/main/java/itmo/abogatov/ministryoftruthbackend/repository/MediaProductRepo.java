package itmo.abogatov.ministryoftruthbackend.repository;

import itmo.abogatov.ministryoftruthbackend.model.MediaProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MediaProductRepo extends CrudRepository<MediaProductEntity, Integer> {
    @Override
    List<MediaProductEntity> findAll();

    @Override
    Optional<MediaProductEntity> findById(Integer id);

    List<MediaProductEntity> findAllByPublisherId(Integer id);
}
