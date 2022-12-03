package itmo.abogatov.ministryoftruthbackend.service.impl;

import itmo.abogatov.ministryoftruthbackend.model.EmployeeProfileEntity;
import itmo.abogatov.ministryoftruthbackend.repository.EmployeeProfileRepo;
import itmo.abogatov.ministryoftruthbackend.service.EmployeeProfileService;
import itmo.abogatov.ministryoftruthbackend.transfer.EmployeeProfileDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class EmployeeProfileServiceImpl implements EmployeeProfileService, UserDetailsService {

    @Autowired
    private EmployeeProfileRepo employeeProfileRepo;

    @Override
    public EmployeeProfileEntity prepareEntity(EmployeeProfileDto data) {
        EmployeeProfileEntity employeeProfile = new EmployeeProfileEntity();
        employeeProfile.setId(data.getId());
        employeeProfile.setLogin(data.getLogin());
        employeeProfile.setPassword(data.getPassword());
        employeeProfile.setAuthToken(data.getAuthToken());
        return employeeProfile;
    }

    @Override
    public EmployeeProfileDto prepareDto(EmployeeProfileEntity entity) {
        EmployeeProfileDto employeeProfile = new EmployeeProfileDto();
        employeeProfile.setId(entity.getId());
        employeeProfile.setLogin(entity.getLogin());
        employeeProfile.setPassword(entity.getPassword());
        employeeProfile.setAuthToken(entity.getAuthToken());
        return employeeProfile;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return find(username);
    }

    public EmployeeProfileEntity save(EmployeeProfileEntity user) {
        return employeeProfileRepo.saveAndFlush(user);
    }

    public EmployeeProfileEntity find(String login) {
        return employeeProfileRepo.findByLogin(login);
    }

    public void invalidateToken(String login) {
        EmployeeProfileEntity user = employeeProfileRepo.findByLogin(login);
        user.setAuthToken(null);
        employeeProfileRepo.save(user);
    }

    public EmployeeProfileEntity findByAuthToken(String token) {
        return employeeProfileRepo.findByAuthToken(token);
    }
}
