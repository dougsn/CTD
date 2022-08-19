package Aula19_Serializacao.ExercicioVideoPG;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Cachorro cachorro1 = new Cachorro("Fido","Pastor Alemão",3);
        Cachorro cachorro2 = new Cachorro("Toby","Labrador",1);
        Cachorro cachorro3 = new Cachorro("Bobby","Collie",7);
        Cachorro cachorro4 = new Cachorro("Smith","Bull",4);


        // Arrays responsáveis pelo passeio do carro no dia da semana

        ArrayList<Cachorro> segunda = new ArrayList<>();
        ArrayList<Cachorro> terca = new ArrayList<>();
        ArrayList<Cachorro> quarta = new ArrayList<>();
        ArrayList<Cachorro> quinta = new ArrayList<>();
        ArrayList<Cachorro> sexta = new ArrayList<>();


        segunda.add(cachorro1);
        segunda.add(cachorro2);
        segunda.add(cachorro3);

        terca.add(cachorro2);

        quarta.add(cachorro1);
        quarta.add(cachorro4);
        quarta.add(cachorro2);

        quinta.add(cachorro3);

        sexta.add(cachorro1);
        sexta.add(cachorro2);
        sexta.add(cachorro3);
        sexta.add(cachorro4);


        // Começando a serialização

        try {
            // Criando o nome do arquivo onde serão salvas as informações.

            FileOutputStream fileOutputStream = new FileOutputStream("cachorros.datas");

            // O ObjectOutputStream é responsável por salvar o arquivo em si.
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // Utilizando o writeObject para "escrever" o que está no array no arquivo cachorros.datas
            objectOutputStream.writeObject(segunda);
            objectOutputStream.writeObject(terca);
            objectOutputStream.writeObject(quarta);
            objectOutputStream.writeObject(quinta);
            objectOutputStream.writeObject(sexta);

            // Encerrando ObjectOutputStream
            objectOutputStream.close();


            // Iniciando a leitura do arquivo criado, "cachorros.datas".

            // Instânciando o Objeto para buscar o arquivo cachorros.datas

            FileInputStream fileInputStream = new FileInputStream("cachorros.datas");

            // Lendo o arquivo que foi buscado no fileInputStream
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // Criando um array para armazenas o que estiver vindo da leitura do objeto.
            ArrayList<Cachorro>  dias;

            for (int i = 0; i < 5; i++){
                System.out.println("Dia: " + (i+1));
                System.out.println("============================");

                // esse readObject está lendo o arquivo fileInputStream e armazenando no array dias, que foi criado vazio
                dias = (ArrayList<Cachorro>) objectInputStream.readObject();

                // Lendo o array dias e atribuindo ao c e imprimindo no console.
                for (Cachorro c: dias ) {
                    System.out.println(c);
                }


            }
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
