package itmo.abogatov.ministryoftruthbackend.repository;

import itmo.abogatov.ministryoftruthbackend.model.DepartmentEntity;
import itmo.abogatov.ministryoftruthbackend.model.DesignationEntity;
import itmo.abogatov.ministryoftruthbackend.transfer.DepartmentDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepo extends CrudRepository<DepartmentEntity, Integer> {
    @Override
    List<DepartmentEntity> findAll();
}
