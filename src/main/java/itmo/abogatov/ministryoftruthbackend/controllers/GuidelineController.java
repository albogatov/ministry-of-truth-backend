package itmo.abogatov.ministryoftruthbackend.controllers;

import itmo.abogatov.ministryoftruthbackend.model.DesignationEntity;
import itmo.abogatov.ministryoftruthbackend.model.GuidelineEntity;
import itmo.abogatov.ministryoftruthbackend.repository.DesignationRepo;
import itmo.abogatov.ministryoftruthbackend.repository.GuidelineRepo;
import itmo.abogatov.ministryoftruthbackend.service.impl.DesignationServiceImpl;
import itmo.abogatov.ministryoftruthbackend.service.impl.GuidelineServiceImpl;
import itmo.abogatov.ministryoftruthbackend.transfer.DesignationDto;
import itmo.abogatov.ministryoftruthbackend.transfer.GuidelineDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/app/guideline/")
public class GuidelineController {

    @Autowired
    private GuidelineRepo repository;
    @Autowired
    private GuidelineServiceImpl service;

    @CrossOrigin
    @GetMapping("/all")
    public ResponseEntity getAllQueries(){
        List<GuidelineEntity> entityList = repository.findAll();
        return ResponseEntity.ok(entityList);
    }

    @CrossOrigin
    @PostMapping("/save")
    public ResponseEntity save(@RequestBody GuidelineDto data){
        repository.save(service.prepareEntity(data));
        return ResponseEntity.ok("");
    }

}
