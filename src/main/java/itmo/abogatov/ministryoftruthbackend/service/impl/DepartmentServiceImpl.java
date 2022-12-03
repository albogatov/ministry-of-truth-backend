package itmo.abogatov.ministryoftruthbackend.service.impl;

import itmo.abogatov.ministryoftruthbackend.model.DepartmentEntity;
import itmo.abogatov.ministryoftruthbackend.service.DepartmentService;
import itmo.abogatov.ministryoftruthbackend.transfer.DepartmentDto;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Override
    public DepartmentEntity prepareEntity(DepartmentDto data) {
        DepartmentEntity departmentEntity = new DepartmentEntity();
        departmentEntity.setId(data.getId());
        departmentEntity.setName(data.getName());
        departmentEntity.setDateFoundation(data.getDateFoundation());
        departmentEntity.setDateTermination(data.getDateTermination());
        departmentEntity.setStatus(data.getStatus());
        departmentEntity.setDesignationId(data.getDesignationId());
        departmentEntity.setMediaCategoryId(data.getMediaCategoryId());
        return departmentEntity;
    }

    @Override
    public DepartmentDto prepareDto(DepartmentEntity entity) {
        DepartmentDto departmentDto = new DepartmentDto();
        departmentDto.setId(entity.getId());
        departmentDto.setName(entity.getName());
        departmentDto.setDateFoundation(entity.getDateFoundation());
        departmentDto.setDateTermination(entity.getDateTermination());
        departmentDto.setStatus(entity.getStatus());
        departmentDto.setDesignationId(entity.getDesignationId());
        departmentDto.setMediaCategoryId(entity.getMediaCategoryId());
        return departmentDto;
    }
}
