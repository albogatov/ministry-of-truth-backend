package itmo.abogatov.ministryoftruthbackend.repository;

import itmo.abogatov.ministryoftruthbackend.model.EmployeeEntity;
import itmo.abogatov.ministryoftruthbackend.model.EmployeeProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Long>  {
}
