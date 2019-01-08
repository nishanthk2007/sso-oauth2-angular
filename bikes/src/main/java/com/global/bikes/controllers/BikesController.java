package com.global.bikes.controllers;

import com.global.bikes.models.Bike;
import com.global.bikes.repositories.BikesRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {

    @Autowired
    private BikesRepository bikesRepository;

    @GetMapping()
    public List<Bike> list(){
        /*List<Bike> bikes = new ArrayList<>();
        return bikes;*/
        return bikesRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bike bike){
        bikesRepository.save(bike);
    }

    @GetMapping("/{id}")
    public Optional<Bike> get(@PathVariable("id") ObjectId id){
//        return new Bike();
        return bikesRepository.findById(id);
    }
}
