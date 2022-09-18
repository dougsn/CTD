package com.example.Filmes.repository;

import com.example.Filmes.entities.FilmeEntities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<FilmeEntities, Integer> {
}
