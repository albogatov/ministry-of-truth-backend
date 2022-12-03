package itmo.abogatov.ministryoftruthbackend.service.impl;

import itmo.abogatov.ministryoftruthbackend.model.MediaProductEntity;
import itmo.abogatov.ministryoftruthbackend.service.MediaCategoryService;
import itmo.abogatov.ministryoftruthbackend.service.MediaProductService;
import itmo.abogatov.ministryoftruthbackend.transfer.MediaProductDto;
import org.springframework.stereotype.Service;

@Service
public class MediaProductServiceImpl implements MediaProductService {
    @Override
    public MediaProductEntity prepareEntity(MediaProductDto data) {
        MediaProductEntity mediaProduct = new MediaProductEntity();
        mediaProduct.setId(data.getId());
        mediaProduct.setEstimation(data.getEstimation());
        mediaProduct.setTitle(data.getTitle());
        mediaProduct.setStatus(data.getStatus());
        mediaProduct.setMediaCategoryId(data.getMediaCategoryId());
        mediaProduct.setPublisherId(data.getPublisherId());
        return mediaProduct;
    }

    @Override
    public MediaProductDto prepareDto(MediaProductEntity entity) {
        MediaProductDto mediaProduct = new MediaProductDto();
        mediaProduct.setId(entity.getId());
        mediaProduct.setEstimation(entity.getEstimation());
        mediaProduct.setTitle(entity.getTitle());
        mediaProduct.setStatus(entity.getStatus());
        mediaProduct.setMediaCategoryId(entity.getMediaCategoryId());
        mediaProduct.setPublisherId(entity.getPublisherId());
        return mediaProduct;
    }
}
