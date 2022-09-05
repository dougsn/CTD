package com.example.ORMParte1.controller;


import com.example.ORMParte1.entity.EstudantesEntity;
import com.example.ORMParte1.service.impl.EstudanteServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EstudanteController {

    // Declaramos e instanciamos o nosso service, para utilizarmos os métodos do service que as os métodos do repositório para uso.
    private final EstudanteServiceImpl estudanteService;

    public EstudanteController(EstudanteServiceImpl estudanteService) {
        this.estudanteService = estudanteService;
    }


    @RequestMapping(value = "/estudantes", method = RequestMethod.GET, produces = "application/json")
    public List<EstudantesEntity> buscarTodosEstudantes(){
        return estudanteService.findAllEstudantes();
    }

    @GetMapping("/estudante/{id}")
    public Optional<EstudantesEntity> buscarEstudantePorId(@PathVariable Long id){
        return estudanteService.findEstudanteById(id);
    }

    @PostMapping("/estudante/adicionar")
    public EstudantesEntity adicionarEstudante(@RequestBody EstudantesEntity estudantesEntity){
        return estudanteService.addEstudante(estudantesEntity);
    }

    @DeleteMapping("/estudante/delete/{id}")
    public String deleteEstudante(@PathVariable Long id){
        return estudanteService.deleteEstudante(id);
    }

    @PutMapping("/estudante/atualizar")
    public String atualizarEstudante(@RequestBody EstudantesEntity estudantesEntity){
        return estudanteService.updateEstudante(estudantesEntity);
    }


}
