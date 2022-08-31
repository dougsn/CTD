package com.cliente.Backend_Cliente;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class MedicamentoClienteController {

    private MedicamentoCliente medicamentoCliente = new MedicamentoCliente();


    @PostMapping("/salvar")
    public MedicamentoModel salvar(@RequestBody MedicamentoModel medicamentoModel){
        return medicamentoCliente.salvar(medicamentoModel);
    }

    @GetMapping("/{id}")
    public MedicamentoModel buscarPorId(@PathVariable Integer id){
        return medicamentoCliente.buscarPorId(id);
    }

    @PutMapping("/atualizar")
    public MedicamentoModel atualizar(@RequestBody MedicamentoModel medicamentoModel){
        return medicamentoCliente.atualizar(medicamentoModel);
    }

    @DeleteMapping("/{id}")
    public String apagar(@PathVariable Integer id){
        return medicamentoCliente.apagar(id);
    }




}
