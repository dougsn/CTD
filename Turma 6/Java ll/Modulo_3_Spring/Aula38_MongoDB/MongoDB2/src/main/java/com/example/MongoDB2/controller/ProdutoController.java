package com.example.MongoDB2.controller;

import com.example.MongoDB2.model.ProdutoModel;
import com.example.MongoDB2.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping()
    public ProdutoModel salvarProduto(@RequestBody ProdutoModel produtoModel){
        return produtoService.salvar(produtoModel);
    }

    @GetMapping()
    public List<ProdutoModel> buscarTodos(){
        return produtoService.buscarTodos();
    }


}
