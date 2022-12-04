package itmo.abogatov.ministryoftruthbackend.repository;

import itmo.abogatov.ministryoftruthbackend.model.CaseEntity;
import itmo.abogatov.ministryoftruthbackend.model.MediaCategoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MediaCategoryRepo extends CrudRepository<MediaCategoryEntity, Integer> {
    @Override
    List<MediaCategoryEntity> findAll();
}
