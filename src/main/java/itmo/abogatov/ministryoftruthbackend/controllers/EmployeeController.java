package itmo.abogatov.ministryoftruthbackend.controllers;

import itmo.abogatov.ministryoftruthbackend.model.CaseEntity;
import itmo.abogatov.ministryoftruthbackend.model.EmployeeEntity;
import itmo.abogatov.ministryoftruthbackend.repository.CaseRepo;
import itmo.abogatov.ministryoftruthbackend.repository.EmployeeRepo;
import itmo.abogatov.ministryoftruthbackend.service.CaseService;
import itmo.abogatov.ministryoftruthbackend.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;


@RestController
@RequestMapping(value = "/api/app/employee/")
public class EmployeeController {
    @Autowired
    private EmployeeRepo repository;
    @Autowired
    private EmployeeServiceImpl service;

    @CrossOrigin
    @GetMapping("/all")
    public ResponseEntity getAllQueries(Principal user){
        List<EmployeeEntity> entityList = repository.findAll();
        return ResponseEntity.ok(entityList);
    }
}
