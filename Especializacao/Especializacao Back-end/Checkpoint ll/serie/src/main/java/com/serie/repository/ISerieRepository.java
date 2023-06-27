package com.serie.repository;

import com.serie.entity.Serie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ISerieRepository extends MongoRepository<Serie, String> {
    @Query("{'genre': ?0}")
    List<Serie> findByGenre(String genre);
}
