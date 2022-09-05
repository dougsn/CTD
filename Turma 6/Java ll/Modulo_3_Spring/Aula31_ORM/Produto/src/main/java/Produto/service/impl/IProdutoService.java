package Produto.service.impl;

import Produto.entity.ProdutoEntity;
import Produto.repository.IProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IProdutoService implements Produto.service.IProdutoService<ProdutoEntity> {

    private final IProdutoRepository produtoRepository;

    public IProdutoService(IProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public List<ProdutoEntity> findAllProdutos() {
        return this.produtoRepository.findAll();
    }

    @Override
    public Optional<ProdutoEntity> findProdutoById(Long id) {
        return this.produtoRepository.findById(id);
    }

    @Override
    public ProdutoEntity addProduto(ProdutoEntity produtoEntity) {
        return this.produtoRepository.save(produtoEntity);
    }

    @Override
    public String deleteProduto(Long id) {
        if(produtoRepository.findById(id).isPresent()){
            this.produtoRepository.deleteById(id);
            return "Produto deletado.";
        }
        return "Produto não encontrado";
    }

    @Override
    public String updateEstudante(ProdutoEntity produtoEntity) {
        if(produtoEntity != null && produtoRepository.findById(produtoEntity.getId()).isPresent()){
            this.produtoRepository.saveAndFlush(produtoEntity);
            return "Produto atualizado com sucesso.";
        }
        return "Não foi possível atualizar o produto";

    }
}
