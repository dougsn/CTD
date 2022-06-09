import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Denis",
                "Gerente",
                "1223.123.123-12",
                "gerente@gmail.com",
                "matricula",
                1212.12,
                100000.00);
        gerente.pagamento();

        Secretaria secretaria = new Secretaria("Secretária",
                "Santos",
                "1223.123.123-12",
                "secretaria@gmail.com",
                "matricula",
                1212.12);
        secretaria.pagamento();

        Vendedor vendedor = new Vendedor("Vendedor",
                "Santos",
                "1223.123.123-12",
                "secretaria@gmail.com",
                "matricula",
                1212.12,
                5000.00);
        vendedor.pagamento();

        Empresa empresaDoZe = new Empresa("Empresa do Zé","cpnpj");
        empresaDoZe.addFuncionario(gerente);
        empresaDoZe.addFuncionario(secretaria);
        empresaDoZe.addFuncionario(vendedor);

        List<Funcionario> funcionariosDaEmpresaDoZe = empresaDoZe.getFuncionarios();

//        funcionariosDaEmpresaDoZe.stream().forEach(data -> {
//            if(data.getNome().equals("Secretária")){
//                funcionariosDaEmpresaDoZe.get().pagamento();
//            }
//        });
    }
}
