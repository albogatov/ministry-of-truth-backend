package itmo.abogatov.ministryoftruthbackend.controllers;

import itmo.abogatov.ministryoftruthbackend.model.CaseEntity;
import itmo.abogatov.ministryoftruthbackend.model.MediaCategoryEntity;
import itmo.abogatov.ministryoftruthbackend.repository.CaseRepo;
import itmo.abogatov.ministryoftruthbackend.repository.MediaCategoryRepo;
import itmo.abogatov.ministryoftruthbackend.repository.MediaProductRepo;
import itmo.abogatov.ministryoftruthbackend.service.CaseService;
import itmo.abogatov.ministryoftruthbackend.service.MediaProductService;
import itmo.abogatov.ministryoftruthbackend.service.impl.MediaCategoryServiceImpl;
import itmo.abogatov.ministryoftruthbackend.service.impl.MediaProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/app/category/")
public class MediaCategoryController {

    @Autowired
    private MediaCategoryRepo repository;
    @Autowired
    private MediaCategoryServiceImpl service;


    @CrossOrigin
    @GetMapping("/all")
    public ResponseEntity getAllQueries(){
        List<MediaCategoryEntity> entityList = repository.findAll();
        return ResponseEntity.ok(entityList);
    }

}
