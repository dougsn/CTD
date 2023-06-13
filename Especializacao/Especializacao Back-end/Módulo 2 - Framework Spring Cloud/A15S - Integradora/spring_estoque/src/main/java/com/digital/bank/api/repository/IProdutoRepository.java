package com.digital.bank.api.repository;

import com.digital.bank.api.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProdutoRepository extends JpaRepository<Produto, Long> {
}
