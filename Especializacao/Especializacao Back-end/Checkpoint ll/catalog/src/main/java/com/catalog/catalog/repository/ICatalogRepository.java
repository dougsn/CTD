package com.catalog.catalog.repository;

import com.catalog.catalog.entity.Catalog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ICatalogRepository extends MongoRepository<Catalog, String> {
    @Query("{'genre': ?0}")
    Catalog findGenre(String genre);
}
