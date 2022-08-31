package com.cliente.Backend_Cliente;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class MedicamentoCliente {

    public MedicamentoModel salvar(MedicamentoModel medicamentoModel){

        HttpResponse<String> response = null;
        MedicamentoModel medicamento = null;

        try {
            response = Unirest.post("http://localhost:8080/medicamentos/salvar") // Passando a URL da api
                    .header("Content-type","application/json") // Preenchendo o cabeçalho
                    .body(JsonUtil.asJsonString(medicamentoModel)).asString(); // Convertendo o objeto para String

            medicamento = JsonUtil.objectFromString(MedicamentoModel.class, response.getBody()); // Fazendo a conversão de Json para Objeto

        }catch (Exception e){
            e.printStackTrace();
        }
        return medicamento;
    }


    public MedicamentoModel buscarPorId(Integer id){
        HttpResponse<String> response = null;
        MedicamentoModel medicamento = null;

        try {
            response = Unirest.get("http://localhost:8080/medicamentos/" + id).asString(); // Passando a URL da api


            medicamento = JsonUtil.objectFromString(MedicamentoModel.class, response.getBody()); // Fazendo a conversão de Json para Objeto

        }catch (Exception e){
            e.printStackTrace();
        }
        return medicamento;
    }


    public MedicamentoModel atualizar(MedicamentoModel medicamentoModel){
        HttpResponse<String> response = null;
        MedicamentoModel medicamento = null;

        try {
            response = Unirest.put("http://localhost:8080/medicamentos/atualizar") // Passando a URL da api
                    .header("Content-type","application/json") // Preenchendo o cabeçalho
                    .body(JsonUtil.asJsonString(medicamentoModel)).asString(); // Convertendo o objeto para String

            medicamento = JsonUtil.objectFromString(MedicamentoModel.class, response.getBody()); // Fazendo a conversão de Json para Objeto

        }catch (Exception e){
            e.printStackTrace();
        }
        return medicamento;
    }

    public String apagar(Integer id) {
        HttpResponse<String> response = null;
        MedicamentoModel medicamento = null;

        try {
            response = Unirest.delete("http://localhost:8080/medicamentos/" + id).asString(); // Passando a URL da api

        }catch (Exception e){
            e.printStackTrace();
        }
        return response != null ? String.valueOf(response.getStatus()) : null ;
    }



}
