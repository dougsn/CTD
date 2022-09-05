package Produto.service;

import java.util.List;
import java.util.Optional;

public interface IProdutoService<T> {

    public List<T> findAllProdutos();
    public Optional<T> findProdutoById(Long id);
    public T addProduto(T t);
    public String deleteProduto(Long id);
    public String updateEstudante(T t);

}
