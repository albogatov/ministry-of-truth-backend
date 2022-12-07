package itmo.abogatov.ministryoftruthbackend.controllers;

import itmo.abogatov.ministryoftruthbackend.model.CaseDeviceEntity;
import itmo.abogatov.ministryoftruthbackend.model.CaseEntity;
import itmo.abogatov.ministryoftruthbackend.model.CaseMediaEntity;
import itmo.abogatov.ministryoftruthbackend.model.MediaProductEntity;
import itmo.abogatov.ministryoftruthbackend.repository.CaseDeviceRepo;
import itmo.abogatov.ministryoftruthbackend.repository.CaseMediaRepo;
import itmo.abogatov.ministryoftruthbackend.repository.CaseRepo;
import itmo.abogatov.ministryoftruthbackend.repository.MediaProductRepo;
import itmo.abogatov.ministryoftruthbackend.service.CaseMediaService;
import itmo.abogatov.ministryoftruthbackend.service.impl.CaseDeviceServiceImpl;
import itmo.abogatov.ministryoftruthbackend.service.impl.DeviceServiceImpl;
import itmo.abogatov.ministryoftruthbackend.transfer.CaseDeviceDto;
import itmo.abogatov.ministryoftruthbackend.transfer.CaseDto;
import itmo.abogatov.ministryoftruthbackend.transfer.CaseMediaDto;
import itmo.abogatov.ministryoftruthbackend.transfer.MediaProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/app/caseDevice/")
public class CaseDeviceController {

    @Autowired
    private CaseDeviceRepo repository;
    @Autowired
    private CaseDeviceServiceImpl service;
    @Autowired
    private CaseRepo caseRepo;


    @CrossOrigin
    @PostMapping("/save")
    public ResponseEntity save(@RequestBody CaseDeviceDto data) {
        try {
            repository.save(service.prepareEntity(data));
            return ResponseEntity.ok("");
        } catch (Exception e) {
            return ResponseEntity.ok(e.getCause());
        }
    }

    @CrossOrigin
    @PostMapping("/delete")
    public ResponseEntity delete(@RequestBody CaseDeviceDto data) {
        repository.delete(service.prepareEntity(data));
        System.out.println(repository.findById(data.getCaseId()));
        return ResponseEntity.ok("");
    }

    @CrossOrigin
    @PostMapping("/case")
    public ResponseEntity getCaseForMedia(@RequestBody MediaProductDto data) {
        List<CaseDeviceEntity> caseDeviceEntities = repository.findAllByDeviceId(data.getId());
        List<CaseEntity> caseEntities = new ArrayList<>();
        for (int i = 0; i < caseDeviceEntities.size(); i++) {
            CaseEntity caseEntity = caseRepo.findById(caseDeviceEntities.get(i).getCaseId()).get();
            if (caseEntity != null)
                caseEntities.add(caseEntity);
        }
        return ResponseEntity.ok(caseEntities);
    }

}
