package itmo.abogatov.ministryoftruthbackend.service;

import itmo.abogatov.ministryoftruthbackend.model.MediaCategoryEntity;
import itmo.abogatov.ministryoftruthbackend.transfer.MediaCategoryDto;

public interface MediaCategoryService {
    MediaCategoryEntity prepareEntity(MediaCategoryDto data);
    MediaCategoryDto prepareDto(MediaCategoryEntity entity);
}