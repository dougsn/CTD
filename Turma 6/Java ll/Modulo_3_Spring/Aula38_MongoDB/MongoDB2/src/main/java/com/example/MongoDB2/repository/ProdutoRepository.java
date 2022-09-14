package com.example.MongoDB2.repository;

import com.example.MongoDB2.model.ProdutoModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends MongoRepository<ProdutoModel, Integer> {
}
