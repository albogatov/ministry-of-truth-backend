package itmo.abogatov.ministryoftruthbackend.controllers;

import itmo.abogatov.ministryoftruthbackend.model.MediaProductEntity;
import itmo.abogatov.ministryoftruthbackend.model.PublisherEntity;
import itmo.abogatov.ministryoftruthbackend.repository.MediaProductRepo;
import itmo.abogatov.ministryoftruthbackend.repository.PublisherRepo;
import itmo.abogatov.ministryoftruthbackend.service.impl.MediaProductServiceImpl;
import itmo.abogatov.ministryoftruthbackend.service.impl.PublisherServiceImpl;
import itmo.abogatov.ministryoftruthbackend.transfer.EmployeeDto;
import itmo.abogatov.ministryoftruthbackend.transfer.PublisherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/app/publisher/")
public class PublisherController {

    @Autowired
    private PublisherRepo repository;
    @Autowired
    private PublisherServiceImpl service;


    @CrossOrigin
    @GetMapping("/all")
    public ResponseEntity getAllQueries(){
        List<PublisherEntity> entityList = repository.findAll();
        return ResponseEntity.ok(entityList);
    }

    @CrossOrigin
    @PostMapping("/save")
    public ResponseEntity save(@RequestBody PublisherDto data){
        repository.save(service.prepareEntity(data));
        return ResponseEntity.ok("");
    }
}
