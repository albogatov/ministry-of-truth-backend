package itmo.abogatov.ministryoftruthbackend.service;

import itmo.abogatov.ministryoftruthbackend.model.DeviceEntity;
import itmo.abogatov.ministryoftruthbackend.transfer.DeviceDto;

public interface DeviceService {
    DeviceEntity prepareEntity(DeviceDto data);
    DeviceDto prepareDto(DeviceEntity entity);
}
