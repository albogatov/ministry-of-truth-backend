package itmo.abogatov.ministryoftruthbackend.service;

import itmo.abogatov.ministryoftruthbackend.model.CaseDeviceEntity;
import itmo.abogatov.ministryoftruthbackend.transfer.CaseDeviceDto;

public interface CaseDeviceService {
    CaseDeviceEntity prepareEntity(CaseDeviceDto data);
    CaseDeviceDto prepareDto(CaseDeviceEntity entity);
}
