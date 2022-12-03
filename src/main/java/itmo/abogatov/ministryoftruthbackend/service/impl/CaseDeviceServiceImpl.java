package itmo.abogatov.ministryoftruthbackend.service.impl;

import itmo.abogatov.ministryoftruthbackend.model.CaseDeviceEntity;
import itmo.abogatov.ministryoftruthbackend.service.CaseDeviceService;
import itmo.abogatov.ministryoftruthbackend.transfer.CaseDeviceDto;
import org.springframework.stereotype.Service;

@Service
public class CaseDeviceServiceImpl implements CaseDeviceService {
    @Override
    public CaseDeviceEntity prepareEntity(CaseDeviceDto data) {
        CaseDeviceEntity caseDevice = new CaseDeviceEntity();
        caseDevice.setCaseId(data.getCaseId());
        caseDevice.setDeviceId(data.getDeviceId());
        return caseDevice;
    }

    @Override
    public CaseDeviceDto prepareDto(CaseDeviceEntity entity) {
        CaseDeviceDto caseDevice = new CaseDeviceDto();
        caseDevice.setCaseId(entity.getCaseId());
        caseDevice.setDeviceId(entity.getDeviceId());
        return caseDevice;
    }
}
