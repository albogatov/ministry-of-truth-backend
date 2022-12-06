package itmo.abogatov.ministryoftruthbackend.controllers;

import itmo.abogatov.ministryoftruthbackend.model.GuidelineEntity;
import itmo.abogatov.ministryoftruthbackend.model.RuleEntity;
import itmo.abogatov.ministryoftruthbackend.repository.GuidelineRepo;
import itmo.abogatov.ministryoftruthbackend.repository.RuleRepo;
import itmo.abogatov.ministryoftruthbackend.service.impl.GuidelineServiceImpl;
import itmo.abogatov.ministryoftruthbackend.service.impl.RuleServiceImpl;
import itmo.abogatov.ministryoftruthbackend.transfer.GuidelineDto;
import itmo.abogatov.ministryoftruthbackend.transfer.RuleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/app/rule/")
public class RuleController {

    @Autowired
    private RuleRepo repository;
    @Autowired
    private RuleServiceImpl service;

    @CrossOrigin
    @PostMapping("/guideline")
    public ResponseEntity getAllByGuideline(@RequestBody GuidelineDto data){
        List<RuleEntity> entityList = repository.findAllByGuidelineId(data.getId());
        return ResponseEntity.ok(entityList);
    }

    @CrossOrigin
    @PostMapping("/save")
    public ResponseEntity save(@RequestBody RuleDto data){
        repository.save(service.prepareEntity(data));
        return ResponseEntity.ok("");
    }
}
