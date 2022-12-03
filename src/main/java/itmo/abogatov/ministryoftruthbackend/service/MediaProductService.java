package itmo.abogatov.ministryoftruthbackend.service;

import itmo.abogatov.ministryoftruthbackend.model.MediaProductEntity;
import itmo.abogatov.ministryoftruthbackend.transfer.MediaProductDto;

public interface MediaProductService {
    MediaProductEntity prepareEntity(MediaProductDto data);
    MediaProductDto prepareDto(MediaProductEntity entity);
}
