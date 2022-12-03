package itmo.abogatov.ministryoftruthbackend.service;

import itmo.abogatov.ministryoftruthbackend.model.PublisherEntity;
import itmo.abogatov.ministryoftruthbackend.transfer.PublisherDto;

public interface PublisherService {
    PublisherEntity prepareEntity(PublisherDto data);
    PublisherDto prepareDto(PublisherEntity entity);
}
