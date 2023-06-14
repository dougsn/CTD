package com.pessoa.repository;

import com.pessoa.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPessoaRepository extends JpaRepository<Pessoa, Long> {
}
