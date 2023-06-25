package com.serie.repository;

import com.serie.entity.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISerieRepository extends JpaRepository<Serie, Long> {
    List<Serie> findByGenre(String genre);
}
