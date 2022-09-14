package com.example.esporteHQL.repository;

import com.example.esporteHQL.entity.TreinadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ITreinadorRepository extends JpaRepository<TreinadorEntity, Long> {

    @Query("select treinador t from Treinador where t.idade = ?1")
    Optional<TreinadorEntity> findTreinadorByIdade(Integer idade);

}
