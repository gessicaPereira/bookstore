package com.wda.bookstore.controller;

import com.wda.bookstore.mapper.PublishingMapper;
import com.wda.bookstore.model.DTO.PublishingDTO;
import com.wda.bookstore.model.DTO.PublishingUpdateDTO;
import com.wda.bookstore.model.PublishingEntity;
import com.wda.bookstore.service.PublishingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/publishing")
public class PublishingController {

    @Autowired
    private PublishingService publishingService;

    @Autowired
    private PublishingMapper publishingMapper;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createPublishing(@RequestBody PublishingDTO publishingDTO){
        publishingService.createPublishing(publishingDTO);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updatePublishing(@PathVariable Integer id, @RequestBody PublishingUpdateDTO publishingUpdateDTO){
        publishingService.updatePublishing(id, publishingUpdateDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){
        publishingService.delete(id);
    }

    @GetMapping
    public ResponseEntity <Page<PublishingEntity>> getAll(Pageable pageable){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(publishingService.getAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity <Object> findById(@PathVariable Integer id){
        Optional <PublishingEntity> publishingEntityOptional = Optional.ofNullable(publishingService.getById(id));
        return publishingEntityOptional.<ResponseEntity<Object>>map(publishingEntity -> ResponseEntity.status(HttpStatus.OK).body(publishingEntity)).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body("Publishing not found"));
    }
}
