package itmo.abogatov.ministryoftruthbackend.service.impl;

import itmo.abogatov.ministryoftruthbackend.model.PublisherEntity;
import itmo.abogatov.ministryoftruthbackend.service.PublisherService;
import itmo.abogatov.ministryoftruthbackend.transfer.PublisherDto;
import org.springframework.stereotype.Service;

@Service
public class PublisherServiceImpl implements PublisherService {

    @Override
    public PublisherEntity prepareEntity(PublisherDto data) {
        PublisherEntity publisher = new PublisherEntity();
        publisher.setId(data.getId());
        publisher.setName(data.getName());
        publisher.setEmployeesCount(data.getEmployeesCount());
        publisher.setFoundationDate(data.getFoundationDate());
        publisher.setRepresentative(data.getRepresentative());
        publisher.setRegistrationCode(data.getRegistrationCode());
        return publisher;
    }

    @Override
    public PublisherDto prepareDto(PublisherEntity entity) {
        PublisherDto publisher = new PublisherDto();
        publisher.setId(entity.getId());
        publisher.setName(entity.getName());
        publisher.setEmployeesCount(entity.getEmployeesCount());
        publisher.setFoundationDate(entity.getFoundationDate());
        publisher.setRepresentative(entity.getRepresentative());
        publisher.setRegistrationCode(entity.getRegistrationCode());
        return publisher;
    }
}
