package itmo.abogatov.ministryoftruthbackend.service.impl;

import itmo.abogatov.ministryoftruthbackend.model.CaseMediaEntity;
import itmo.abogatov.ministryoftruthbackend.service.CaseMediaService;
import itmo.abogatov.ministryoftruthbackend.transfer.CaseMediaDto;
import org.springframework.stereotype.Service;

@Service
public class CaseMediaServiceImpl implements CaseMediaService {
    @Override
    public CaseMediaEntity prepareEntity(CaseMediaDto data) {
        CaseMediaEntity caseMedia = new CaseMediaEntity();
        caseMedia.setCaseId(data.getCaseId());
        caseMedia.setMediaId(data.getMediaId());
        return caseMedia;
    }

    @Override
    public CaseMediaDto prepareDto(CaseMediaEntity entity) {
        CaseMediaDto caseMedia = new CaseMediaDto();
        caseMedia.setCaseId(entity.getCaseId());
        caseMedia.setMediaId(entity.getMediaId());
        return caseMedia;
    }
}
