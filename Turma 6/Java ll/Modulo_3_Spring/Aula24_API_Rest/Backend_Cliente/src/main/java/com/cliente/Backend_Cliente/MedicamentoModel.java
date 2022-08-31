package com.cliente.Backend_Cliente;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MedicamentoModel {

    private Integer id;
    private String nome;
    private String laboratorio;
    private Integer quantidade;
    private Double preco;

}
