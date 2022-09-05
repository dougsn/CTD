package Produto.repository;

import Produto.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
}
