package itmo.abogatov.ministryoftruthbackend.service.impl;

import itmo.abogatov.ministryoftruthbackend.model.GuidelineEntity;
import itmo.abogatov.ministryoftruthbackend.service.GuidelineService;
import itmo.abogatov.ministryoftruthbackend.transfer.GuidelineDto;
import org.springframework.stereotype.Service;

@Service
public class GuidelineServiceImpl implements GuidelineService {
    @Override
    public GuidelineEntity prepareEntity(GuidelineDto data) {
        GuidelineEntity guideline = new GuidelineEntity();
        guideline.setId(data.getId());
        guideline.setName(data.getName());
        guideline.setDepartmentId(data.getDepartmentId());
        guideline.setNewspeakVersion(data.getNewspeakVersion());
        guideline.setAuthorId(data.getAuthorId());
        guideline.setReleaseDate(data.getReleaseDate());
        return guideline;
    }

    @Override
    public GuidelineDto prepareDto(GuidelineEntity entity) {
        GuidelineDto guideline = new GuidelineDto();
        guideline.setId(entity.getId());
        guideline.setName(entity.getName());
        guideline.setDepartmentId(entity.getDepartmentId());
        guideline.setNewspeakVersion(entity.getNewspeakVersion());
        guideline.setAuthorId(entity.getAuthorId());
        guideline.setReleaseDate(entity.getReleaseDate());
        return guideline;
    }
}
