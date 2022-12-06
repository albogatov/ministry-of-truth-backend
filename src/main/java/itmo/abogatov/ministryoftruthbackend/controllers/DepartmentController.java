package itmo.abogatov.ministryoftruthbackend.controllers;

import itmo.abogatov.ministryoftruthbackend.model.DepartmentEntity;
import itmo.abogatov.ministryoftruthbackend.model.DesignationEntity;
import itmo.abogatov.ministryoftruthbackend.repository.DepartmentRepo;
import itmo.abogatov.ministryoftruthbackend.repository.DesignationRepo;
import itmo.abogatov.ministryoftruthbackend.service.impl.DepartmentServiceImpl;
import itmo.abogatov.ministryoftruthbackend.service.impl.DesignationServiceImpl;
import itmo.abogatov.ministryoftruthbackend.transfer.DepartmentDto;
import itmo.abogatov.ministryoftruthbackend.transfer.DesignationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/app/department/")
public class DepartmentController {

    @Autowired
    private DepartmentRepo repository;
    @Autowired
    private DepartmentServiceImpl service;

    @CrossOrigin
    @GetMapping("/all")
    public ResponseEntity getAllQueries(){
        List<DepartmentEntity> entityList = repository.findAll();
        return ResponseEntity.ok(entityList);
    }

    @CrossOrigin
    @PostMapping("/save")
    public ResponseEntity save(@RequestBody DepartmentDto data){
        repository.save(service.prepareEntity(data));
        return ResponseEntity.ok("");
    }
}
