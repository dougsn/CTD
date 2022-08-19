package Aula19_Serializacao.ExercicioPG;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Pagina pagina1 = new Pagina("www.digitalhouse.com","Digital House");
        Pagina pagina2 = new Pagina("www.playground.com","Digital House");

        ArrayList<Pagina> favoritos = new ArrayList<>();

        favoritos.add(pagina1);
        favoritos.add(pagina2);


        // Começando a serialização


        try {
            FileOutputStream fileOutputStream = new FileOutputStream("favoritos.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // Criando o arquivo com base nas informações do array favoritos
            objectOutputStream.writeObject(favoritos);

            // Fechando a inserção de informação
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("favoritos.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // Atribuindo ao array retornoFavoritos o resultado da leitura do arquivo favoritos.txt
            ArrayList<Pagina> retornoFavoritos = (ArrayList<Pagina>) objectInputStream.readObject();


            // Loop criado para ler o array retornoFavortivos e atribuir a variavel de controle f.
            for (Pagina f: retornoFavoritos) {
                System.out.println(f);
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
