package com.example.Fixture.repository;

import com.example.Fixture.entity.EstadoEntity;
import com.example.Fixture.entity.PartidaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPartidaRepository extends MongoRepository<PartidaEntity, Integer> {

    List<PartidaEntity> findAllByEstado(EstadoEntity estado);

}
