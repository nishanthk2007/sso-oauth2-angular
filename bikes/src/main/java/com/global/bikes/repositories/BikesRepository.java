package com.global.bikes.repositories;

import com.global.bikes.models.Bike;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BikesRepository extends MongoRepository<Bike, ObjectId> {
   /* public void delete(Bike deleted);
    public List<Bike> findAll();
    public Bike find(ObjectId id);
    public Bike save(Bike saved);*/
}
