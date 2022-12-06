package itmo.abogatov.ministryoftruthbackend.controllers;

import itmo.abogatov.ministryoftruthbackend.model.DesignationEntity;
import itmo.abogatov.ministryoftruthbackend.model.MediaProductEntity;
import itmo.abogatov.ministryoftruthbackend.repository.DesignationRepo;
import itmo.abogatov.ministryoftruthbackend.repository.MediaProductRepo;
import itmo.abogatov.ministryoftruthbackend.service.impl.DesignationServiceImpl;
import itmo.abogatov.ministryoftruthbackend.service.impl.MediaProductServiceImpl;
import itmo.abogatov.ministryoftruthbackend.transfer.DesignationDto;
import itmo.abogatov.ministryoftruthbackend.transfer.MediaProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/app/designation/")
public class DesignationController {

    @Autowired
    private DesignationRepo repository;
    @Autowired
    private DesignationServiceImpl service;

    @CrossOrigin
    @GetMapping("/all")
    public ResponseEntity getAllQueries(){
        List<DesignationEntity> entityList = repository.findAll();
        return ResponseEntity.ok(entityList);
    }

    @CrossOrigin
    @PostMapping("/save")
    public ResponseEntity save(@RequestBody DesignationDto data){
        repository.save(service.prepareEntity(data));
        return ResponseEntity.ok("");
    }

}
