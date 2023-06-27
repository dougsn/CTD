package com.catalog.catalog.repository;

import com.catalog.catalog.entity.Catalog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ICatalogRepository extends MongoRepository<Catalog, String> {
    @Query("{'genre': ?0}")
    List<Catalog> findGenre(String genre);
}
