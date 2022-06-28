class Main {
    public static void main(String[] args) {
        EmpregadoFactory ef = EmpregadoFactory.getInstance();
        Empregado empregado = ef.criarEmpregado("Nome", "EMP-INT");
        ((EmpregadoRelacaoDep) empregado).setSalarioMensal(7300);

        Empregado empregado2 = ef.criarEmpregado("Nome", "EMP-EXT");
        ((EmpregadoContratado) empregado2).setValorHora(41.66);
        ((EmpregadoContratado) empregado2).setImposto(89.98);

        System.out.println(empregado.calcularSalario(2));
        System.out.println(empregado2.calcularSalario(2));
    }
}