package itmo.abogatov.ministryoftruthbackend.controllers;

import itmo.abogatov.ministryoftruthbackend.model.CaseEntity;
import itmo.abogatov.ministryoftruthbackend.model.CaseMediaEntity;
import itmo.abogatov.ministryoftruthbackend.model.MediaProductEntity;
import itmo.abogatov.ministryoftruthbackend.repository.CaseMediaRepo;
import itmo.abogatov.ministryoftruthbackend.repository.CaseRepo;
import itmo.abogatov.ministryoftruthbackend.repository.MediaProductRepo;
import itmo.abogatov.ministryoftruthbackend.service.CaseMediaService;
import itmo.abogatov.ministryoftruthbackend.service.CaseService;
import itmo.abogatov.ministryoftruthbackend.transfer.CaseDto;
import itmo.abogatov.ministryoftruthbackend.transfer.CaseMediaDto;
import itmo.abogatov.ministryoftruthbackend.transfer.IdDto;
import itmo.abogatov.ministryoftruthbackend.transfer.MediaProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/app/caseMedia/")
public class CaseMediaController {

    @Autowired
    private CaseMediaRepo repository;
    @Autowired
    private CaseMediaService service;
    @Autowired
    private MediaProductRepo mediaProductRepo;
    @Autowired
    private CaseRepo caseRepo;


    @CrossOrigin
    @PostMapping("/media")
    public ResponseEntity getMediaForCase(@RequestBody CaseDto data) {
        List<CaseMediaEntity> caseMediaEntityList = repository.findAllByCaseId(data.getId());
        List<MediaProductEntity> mediaProductEntities = new ArrayList<>();
        for (int i = 0; i < caseMediaEntityList.size(); i++) {
            MediaProductEntity mediaProduct = mediaProductRepo.findById(caseMediaEntityList.get(i).getMediaId()).get();
            if (mediaProduct != null)
                mediaProductEntities.add(mediaProduct);
        }
        return ResponseEntity.ok(mediaProductEntities);
    }

    @CrossOrigin
    @PostMapping("/save")
    public ResponseEntity save(@RequestBody CaseMediaDto data) {
        repository.save(service.prepareEntity(data));
        System.out.println(repository.findById(data.getCaseId()));
        return ResponseEntity.ok("");
    }

    @CrossOrigin
    @PostMapping("/delete")
    public ResponseEntity delete(@RequestBody CaseMediaDto data) {
        repository.delete(service.prepareEntity(data));
        System.out.println(repository.findById(data.getCaseId()));
        return ResponseEntity.ok("");
    }

    @CrossOrigin
    @PostMapping("/case")
    public ResponseEntity getCaseForMedia(@RequestBody MediaProductDto data) {
        List<CaseMediaEntity> caseMediaEntityList = repository.findAllByMediaId(data.getId());
        List<CaseEntity> caseEntities = new ArrayList<>();
        for (int i = 0; i < caseMediaEntityList.size(); i++) {
            CaseEntity caseEntity = caseRepo.findById(caseMediaEntityList.get(i).getCaseId()).get();
            if (caseEntity != null)
                caseEntities.add(caseEntity);
        }
        return ResponseEntity.ok(caseEntities);
    }

    @CrossOrigin
    @PostMapping("/connect")
    public ResponseEntity newConnection(@RequestBody CaseMediaDto data) {
        CaseMediaEntity caseMedia = service.prepareEntity(data);
        repository.save(caseMedia);
        return ResponseEntity.ok("Connection saved");
    }

}
