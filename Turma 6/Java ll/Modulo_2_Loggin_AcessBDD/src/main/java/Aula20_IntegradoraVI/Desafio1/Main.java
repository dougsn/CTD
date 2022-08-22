package Aula20_IntegradoraVI.Desafio1;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("231335234","Digital");
        Funcionario funcionario1 = new Funcionario("Douglas","Silva","21.513.132-2",5000d);
        Funcionario funcionario2 = new Funcionario("Diogo","Lopes","21.513.132-2",2000d);
        Funcionario funcionario3 = new Funcionario("Jonatas","Silva","21.513.132-2",1000d);
        Funcionario funcionario4 = new Funcionario("Claudio","Nascimento","21.513.132-2",3500d);
        Funcionario funcionario5 = new Funcionario("Daiana","Santos","21.513.132-2",1650d);

        empresa.addFuncionario(funcionario1);
        empresa.addFuncionario(funcionario2);
        empresa.addFuncionario(funcionario3);
        empresa.addFuncionario(funcionario4);
        empresa.addFuncionario(funcionario5);

        ArrayList<Empresa> empresas = new ArrayList<>();


        try {
            FileOutputStream fileOutputStream = new FileOutputStream("empresa.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            empresas.add(empresa);
            objectOutputStream.writeObject(empresas);



            FileInputStream fileInputStream = new FileInputStream("empresa.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<Empresa> retornoEmpresa = (ArrayList<Empresa>) objectInputStream.readObject();

            for (Empresa e: retornoEmpresa){
                System.out.println(e);
            }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
