package com.example.Injecao_Dependencia.service.impl;

import com.example.Injecao_Dependencia.dto.LivroDTO;
import com.example.Injecao_Dependencia.entity.LivroEntity;
import com.example.Injecao_Dependencia.repository.ILivroRepository;
import com.example.Injecao_Dependencia.service.ILivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LivroServiceImpl implements ILivroService {
    @Autowired // Cria todos os instanciamentos sozinho e faz a ligação entre as camadas. (Isso é injeção de dependência).
    private ILivroRepository repository;

    @Override
    public List<LivroDTO> buscarTodosLivros() {
        List<LivroDTO> response;
        List<LivroEntity> livroEntityList = this.repository.buscarTodosLivros();


        response = livroEntityList.stream().map(LivroDTO::new).collect(Collectors.toList());
        // Usamos essa formula para preencher a nossa lista que é o stream(recurso java para retornar um fluxo) que vai
        // percorrer a lista e vamos fazer o mapeamento para cada um dos itens da nossa lista. E vamos criar um novo DTO
        // e depois ele joga essa coleção para um lista(Collectors.toList()).
        // Essa lista de DTP vao ser mandado para o controller

        return response;

    }
}
