package com.example.esporteHQL.repository;

import com.example.esporteHQL.entity.JogadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface IJogadorRepository extends JpaRepository<JogadorEntity, Long> {

    @Query("Select jogador j from Jogador where j.nome = ?1")
    Optional<JogadorEntity> findJogadorByName(String name);

}
