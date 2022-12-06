package itmo.abogatov.ministryoftruthbackend.controllers;

import itmo.abogatov.ministryoftruthbackend.model.DeviceEntity;
import itmo.abogatov.ministryoftruthbackend.model.MediaProductEntity;
import itmo.abogatov.ministryoftruthbackend.repository.DeviceRepo;
import itmo.abogatov.ministryoftruthbackend.repository.MediaProductRepo;
import itmo.abogatov.ministryoftruthbackend.service.impl.DeviceServiceImpl;
import itmo.abogatov.ministryoftruthbackend.service.impl.MediaProductServiceImpl;
import itmo.abogatov.ministryoftruthbackend.transfer.DeviceDto;
import itmo.abogatov.ministryoftruthbackend.transfer.MediaProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/app/device/")
public class DeviceController {

    @Autowired
    private DeviceRepo repository;
    @Autowired
    private DeviceServiceImpl service;

    @CrossOrigin
    @GetMapping("/all")
    public ResponseEntity getAllQueries(){
        List<DeviceEntity> entityList = repository.findAll();
        return ResponseEntity.ok(entityList);
    }

    @CrossOrigin
    @PostMapping("/save")
    public ResponseEntity save(@RequestBody DeviceDto data){
        repository.save(service.prepareEntity(data));
        return ResponseEntity.ok("");
    }
}
