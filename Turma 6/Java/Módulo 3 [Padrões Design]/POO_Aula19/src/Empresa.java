import java.util.List;

public class Empresa {
    private String cnpj;
    private List<Empregado> empregados;

    public Empresa (String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public List<Empregado> getEmpregados() {
        return empregados;
    }

    public void setEmpregados(List<Empregado> empregados) {
        this.empregados = empregados;
    }
}
