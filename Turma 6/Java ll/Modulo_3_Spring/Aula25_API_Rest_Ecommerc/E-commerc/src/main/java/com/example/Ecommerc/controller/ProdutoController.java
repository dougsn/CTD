package com.example.Ecommerc.controller;


import com.example.Ecommerc.model.Produto;
import com.example.Ecommerc.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {



    @Autowired // Linkando com os serviços
    ProdutoService service;

    @PostMapping
    public Produto salvaProduto(@RequestBody Produto produto) throws SQLException {
       return service.salvar(produto);
    }

    @GetMapping
    public List<Produto> buscarTodos() throws SQLException {
        return service.buscarTodos();
    }

    @RequestMapping(value = "/buscaId")
    public Produto buscarPorId(@RequestParam("id") int id) throws SQLException{
        return service.buscarPorId(id).isEmpty() ? new Produto() : service.buscarPorId(id).get();
    }

    @PatchMapping
    public void alterar(@RequestBody Produto produto) throws SQLException{
        System.out.println();
        service.alterar(produto);
    }

    @DeleteMapping
    public void excluir(@RequestParam("id") int id) throws SQLException{
        service.excluir(id);
    }




}
