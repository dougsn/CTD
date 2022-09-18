package com.example.Fixture.repository;

import com.example.Fixture.entity.EquipeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEquipeRepository extends MongoRepository<EquipeEntity, Integer> {
}
