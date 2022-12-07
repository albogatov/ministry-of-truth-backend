package itmo.abogatov.ministryoftruthbackend.controllers;

import itmo.abogatov.ministryoftruthbackend.model.CaseEntity;
import itmo.abogatov.ministryoftruthbackend.repository.CaseRepo;
import itmo.abogatov.ministryoftruthbackend.service.CaseService;
import itmo.abogatov.ministryoftruthbackend.transfer.CaseDto;
import itmo.abogatov.ministryoftruthbackend.transfer.IdDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/app/case/")
public class CaseController {

    @Autowired
    private CaseRepo repository;
    @Autowired
    private CaseService service;


    @CrossOrigin
    @PostMapping("/save")
    public ResponseEntity save(@RequestBody CaseDto data){
        if(data.getState() == "Closed")
            repository.closeCase(data.getId());
        repository.save(service.prepareEntity(data));
        return ResponseEntity.ok("");
    }

    @CrossOrigin
    @GetMapping("/all")
    public ResponseEntity getAllQueries(){
        List<CaseEntity> entityList = repository.findAll();
        return ResponseEntity.ok(entityList);
    }

    @CrossOrigin
    @GetMapping("/single")
    public ResponseEntity getById(@RequestBody IdDto data){
        CaseEntity entity = repository.findById(data.getId()).get();
        return ResponseEntity.ok(service.prepareDto(entity));
    }

}
