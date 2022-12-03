package itmo.abogatov.ministryoftruthbackend.service.impl;

import itmo.abogatov.ministryoftruthbackend.model.DeviceEntity;
import itmo.abogatov.ministryoftruthbackend.service.DeviceService;
import itmo.abogatov.ministryoftruthbackend.transfer.DeviceDto;
import org.springframework.stereotype.Service;

@Service
public class DeviceServiceImpl implements DeviceService {

    @Override
    public DeviceEntity prepareEntity(DeviceDto data) {
        DeviceEntity device = new DeviceEntity();
        device.setId(data.getId());
        device.setDateMade(data.getDateMade());
        device.setModel(data.getModel());
        device.setDateTerminated(data.getDateTerminated());
        device.setType(data.getType());
        device.setMaintainerId(data.getMaintainerId());
        return device;
    }

    @Override
    public DeviceDto prepareDto(DeviceEntity entity) {
        DeviceDto device = new DeviceDto();
        device.setId(entity.getId());
        device.setDateMade(entity.getDateMade());
        device.setModel(entity.getModel());
        device.setDateTerminated(entity.getDateTerminated());
        device.setType(entity.getType());
        device.setMaintainerId(entity.getMaintainerId());
        return device;
    }
}
