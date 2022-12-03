package itmo.abogatov.ministryoftruthbackend.service.impl;

import itmo.abogatov.ministryoftruthbackend.model.MediaCategoryEntity;
import itmo.abogatov.ministryoftruthbackend.service.MediaCategoryService;
import itmo.abogatov.ministryoftruthbackend.transfer.MediaCategoryDto;
import org.springframework.stereotype.Service;

@Service
public class MediaCategoryServiceImpl implements MediaCategoryService {

    @Override
    public MediaCategoryEntity prepareEntity(MediaCategoryDto data) {
        MediaCategoryEntity mediaCategory = new MediaCategoryEntity();
        mediaCategory.setId(data.getId());
        mediaCategory.setName(data.getName());
        mediaCategory.setType(data.getType());
        mediaCategory.setYearlyQuota(data.getYearlyQuota());
        return mediaCategory;
    }

    @Override
    public MediaCategoryDto prepareDto(MediaCategoryEntity entity) {
        MediaCategoryDto mediaCategory = new MediaCategoryDto();
        mediaCategory.setId(entity.getId());
        mediaCategory.setName(entity.getName());
        mediaCategory.setType(entity.getType());
        mediaCategory.setYearlyQuota(entity.getYearlyQuota());
        return mediaCategory;
    }
}
