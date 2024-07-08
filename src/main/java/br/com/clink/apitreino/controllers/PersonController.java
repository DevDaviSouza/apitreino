package br.com.clink.apitreino.controllers;

import org.springframework.web.bind.annotation.RestController;

import br.com.clink.apitreino.dataVoV1.PersonVO;

import br.com.clink.apitreino.repositories.PersonRepository;
import br.com.clink.apitreino.services.PersonServices;
import jakarta.validation.Valid;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServices service;
    
    @Autowired
    PersonRepository repository;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> findByID(@PathVariable(value = "id") Long id) throws Exception {
         
     return ResponseEntity.status(HttpStatus.OK).body(repository.findById(id));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PersonVO> findAll() {
         return service.findAll();
    }

    //POST

    @PostMapping()
	public ResponseEntity<PersonVO> create(@RequestBody @Valid PersonVO person) {
         return ResponseEntity.status(HttpStatus.CREATED).body(service.create(person));
	}

    //PUT

    @PutMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PersonVO> update(@RequestBody PersonVO person) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.update(person));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
         service.delete(id);
         return ResponseEntity.noContent().build();
    }

}
