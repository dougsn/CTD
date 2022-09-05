package Produto.controller;


import Produto.entity.ProdutoEntity;
import Produto.service.impl.IProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    public final IProdutoService produtoService;

    public ProdutoController(IProdutoService produtoService) {
        this.produtoService = produtoService;
    }


    @GetMapping("")
    public List<ProdutoEntity> findAllProdutos() {
        return this.produtoService.findAllProdutos();
    }

    @GetMapping("/{id}")
    public Optional<ProdutoEntity> buscarProdutoPorId(@PathVariable Long id){
        return this.produtoService.findProdutoById(id);
    }

    @PostMapping("/cadastrar")
    public ProdutoEntity cadastrarProduto(@RequestBody ProdutoEntity produtoEntity){
        return this.produtoService.addProduto(produtoEntity);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletarProduto(@PathVariable Long id){
        return this.produtoService.deleteProduto(id);
    }

    @PutMapping("/atualizar")
    public String atualizarProduto(@RequestBody ProdutoEntity produtoEntity){
        return this.produtoService.updateEstudante(produtoEntity);
    }




}
