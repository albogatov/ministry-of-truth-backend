package itmo.abogatov.ministryoftruthbackend.repository;

import itmo.abogatov.ministryoftruthbackend.model.EmployeeProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeProfileRepo extends JpaRepository<EmployeeProfileEntity, Long> {
    public EmployeeProfileEntity findByLogin(String login);

    public EmployeeProfileEntity findByAuthToken(String token);
}
