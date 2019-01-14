package com.sprint.controller;

import com.sprint.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/albums")
public class AlbumController {

    
    public static CrudRepository<Album, String> repository;
      
   
    @Autowired
    public AlbumController(CrudRepository<Album, String> repository) {
        this.repository = repository;
    }
   

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Album> albums() {
        return repository.findAll();
    } 

    @RequestMapping(method = RequestMethod.PUT)
    public Album add(@RequestBody @Valid Album album) {
        //logger.info("Adding album " + album.getId());
        return repository.save(album);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Album update(@RequestBody @Valid Album album) {
        //logger.info("Updating album " + album.getId());
        return repository.save(album);
    }

 
}