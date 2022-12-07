package itmo.abogatov.ministryoftruthbackend.controllers;

import itmo.abogatov.ministryoftruthbackend.model.DepartmentEntity;
import itmo.abogatov.ministryoftruthbackend.model.DesignationEntity;
import itmo.abogatov.ministryoftruthbackend.repository.DepartmentRepo;
import itmo.abogatov.ministryoftruthbackend.repository.DesignationRepo;
import itmo.abogatov.ministryoftruthbackend.service.impl.DepartmentServiceImpl;
import itmo.abogatov.ministryoftruthbackend.service.impl.DesignationServiceImpl;
import itmo.abogatov.ministryoftruthbackend.transfer.DepartmentDto;
import itmo.abogatov.ministryoftruthbackend.transfer.DesignationDto;
import itmo.abogatov.ministryoftruthbackend.transfer.IdDto;
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

    @CrossOrigin
    @PostMapping("/getStats")
    public ResponseEntity getStatsOnDepartment(@RequestBody IdDto data) {
        Integer stats = repository.getStatsById(data.getId());
        return ResponseEntity.ok(stats);
    }

    @CrossOrigin
    @PostMapping("/checkTarget")
    public ResponseEntity getTarget(@RequestBody IdDto data) {
        Boolean stats = repository.checkTarget(data.getId());
        return ResponseEntity.ok(stats);
    }

    @CrossOrigin
    @GetMapping("/countTargetFailed")
    public ResponseEntity getTargetFailed() {
        Integer stats = repository.checkTargetFailed();
        return ResponseEntity.ok(stats);
    }
}
