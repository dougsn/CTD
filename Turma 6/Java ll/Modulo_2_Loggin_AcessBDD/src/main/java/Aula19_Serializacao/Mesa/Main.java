package Aula19_Serializacao.Mesa;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        Contato contato1 = new Contato("Douglas","douglas@gmail.com","(21) 98512-6523");
        Contato contato2 = new Contato("Jonatas","jonatas@gmail.com","(21) 98512-2396");
        Contato contato3 = new Contato("Daniel","daniel@gmail.com","(21) 97649-3014");


        ArrayList<Contato> contatos = new ArrayList<>();

        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);


        try {
            // Criando o arquivo de contatos e populando.

            FileOutputStream fileOutputStream = new FileOutputStream("contatos.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(contatos);
            objectOutputStream.close();

            // Realizando a leitura do arquivo e retornando no console.

            FileInputStream fileInputStream = new FileInputStream("contatos.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            ArrayList<Contato> retornoContatos = (ArrayList<Contato>) objectInputStream.readObject();

            for (Contato c: retornoContatos){
                System.out.println(c);
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
