package Aula20_IntegradoraVI.Desafio1;

import java.util.ArrayList;

public class Empresa {

    private String cnpj;
    private String razao_social;
    private final ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Empresa(String cnpj, String razao_social) {
        this.cnpj = cnpj;
        this.razao_social = razao_social;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

}
