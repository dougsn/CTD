package com.example.Ecommerc.service;

import com.example.Ecommerc.dao.IDao;
import com.example.Ecommerc.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired // Fazendo a linkagem com o IDao
    IDao<Produto> produtoDaoH2; // instanciando o IDao para ter acessar aos métodos do CRUD criado.

    public Produto salvar(Produto produto) throws SQLException {
        return produtoDaoH2.salvar(produto);
    }

    public List<Produto> buscarTodos() throws SQLException{
        return produtoDaoH2.buscarTodos();
    }

    public void alterar(Produto produto) throws SQLException{
        produtoDaoH2.alterar(produto);
    }

    public void excluir(int id) throws SQLException{
        produtoDaoH2.excluir(id);
    }

    public Optional<Produto> buscarPorId(int id) throws SQLException {
        return produtoDaoH2.buscarPorId(id);
    }


}
