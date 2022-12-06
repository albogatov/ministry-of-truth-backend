package itmo.abogatov.ministryoftruthbackend.controllers;

import itmo.abogatov.ministryoftruthbackend.model.DepartmentEntity;
import itmo.abogatov.ministryoftruthbackend.model.PositionEntity;
import itmo.abogatov.ministryoftruthbackend.repository.DepartmentRepo;
import itmo.abogatov.ministryoftruthbackend.repository.PositionRepo;
import itmo.abogatov.ministryoftruthbackend.service.impl.DepartmentServiceImpl;
import itmo.abogatov.ministryoftruthbackend.service.impl.PositionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/app/position/")
public class PositionController {

    @Autowired
    private PositionRepo repository;
    @Autowired
    private PositionServiceImpl service;

    @CrossOrigin
    @GetMapping("/all")
    public ResponseEntity getAllQueries(){
        List<PositionEntity> entityList = repository.findAll();
        return ResponseEntity.ok(entityList);
    }

}
