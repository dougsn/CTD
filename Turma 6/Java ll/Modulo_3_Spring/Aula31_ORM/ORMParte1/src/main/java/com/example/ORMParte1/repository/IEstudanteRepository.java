package com.example.ORMParte1.repository;

import com.example.ORMParte1.entity.EstudantesEntity;
import org.springframework.data.jpa.repository.JpaRepository;


// Passando qual entidade que trabalharei com esse repositório e também o Tipo da ID dessa entidade.
public interface IEstudanteRepository extends JpaRepository<EstudantesEntity, Long> {
}
