package itmo.abogatov.ministryoftruthbackend.controllers;

import itmo.abogatov.ministryoftruthbackend.model.MediaCategoryEntity;
import itmo.abogatov.ministryoftruthbackend.model.MediaProductEntity;
import itmo.abogatov.ministryoftruthbackend.repository.MediaCategoryRepo;
import itmo.abogatov.ministryoftruthbackend.repository.MediaProductRepo;
import itmo.abogatov.ministryoftruthbackend.service.impl.MediaProductServiceImpl;
import itmo.abogatov.ministryoftruthbackend.transfer.CaseDto;
import itmo.abogatov.ministryoftruthbackend.transfer.MediaProductDto;
import itmo.abogatov.ministryoftruthbackend.transfer.PublisherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/app/media/")
public class MediaProductController {

    @Autowired
    private MediaProductRepo repository;
    @Autowired
    private MediaProductServiceImpl service;

    @CrossOrigin
    @GetMapping("/all")
    public ResponseEntity getAllQueries(){
        List<MediaProductEntity> entityList = repository.findAll();
        return ResponseEntity.ok(entityList);
    }

    @CrossOrigin
    @PostMapping("/save")
    public ResponseEntity save(@RequestBody MediaProductDto data){
        try {
            MediaProductEntity mediaProduct = repository.save(service.prepareEntity(data));
            return ResponseEntity.ok("");
        } catch (Exception e) {
            return ResponseEntity.ok(e.getCause());
        }

    }

    @CrossOrigin
    @PostMapping("/publisher")
    public ResponseEntity getByPublisher(@RequestBody PublisherDto data) {
        List<MediaProductEntity> mediaProductEntities = repository.findAllByPublisherId(data.getId());
        return ResponseEntity.ok(mediaProductEntities);
    }

}
