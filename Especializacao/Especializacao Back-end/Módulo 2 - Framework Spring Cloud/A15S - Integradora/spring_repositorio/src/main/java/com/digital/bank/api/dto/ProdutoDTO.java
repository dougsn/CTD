package com.digital.bank.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDTO {
    private Long id;
    private String name;
    private String tipo;
    private Integer price;
}
