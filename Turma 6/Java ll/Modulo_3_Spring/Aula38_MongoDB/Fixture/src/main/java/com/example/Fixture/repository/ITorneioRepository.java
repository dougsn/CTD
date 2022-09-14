package com.example.Fixture.repository;

import com.example.Fixture.entity.TorneioEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITorneioRepository extends MongoRepository<TorneioEntity, Integer> {
}
