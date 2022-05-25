import java.util.Date;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

//        Impressora impressora1 = new Impressora("ABC", "USB", new Date(), 2 );
//
//        System.out.println(impressora1.getDataFabricacao());
//        impressora1.imprimir("Olá, sobraram: " + impressora1.getFolhasDisponiveis() + " folhas disponíveis");
//        impressora1.imprimir("Olá, sobraram: " + impressora1.getFolhasDisponiveis() + " folhas disponíveis");
//        impressora1.imprimir("Olá, sobraram: " + impressora1.getFolhasDisponiveis() + " folhas disponíveis");

        // Aula
//        ImpressoraAula impressoraSemPapel = new ImpressoraAula(
//                "HP",
//                "Sem fio",
//                //LocalDate.of(2020, 5, 25) ou
//                LocalDate.parse("2022-05-25")
//        );
//
//        ImpressoraAula impressoraComPapel = new ImpressoraAula(
//                "Epson",
//                "Sem fio",
//                LocalDate.now(),
//                10
//        );
//
//        impressoraSemPapel.setFolhasDisponiveis(2);
//        impressoraSemPapel.imprimir("Teste");
//        impressoraComPapel.imprimir("Teste2");


        Cachorro cachorro1 = new Cachorro(true, "Vira-Lata", 2019,5.1,true,true,"Bidu");

        Cachorro cachorro2 = new Cachorro(4.9, false, true, "Lunna", 2010);


        System.out.println(cachorro1.idadeChip());
        System.out.println(cachorro1.adocao( cachorro1.getFerido() ,cachorro1.getPeso()));


        System.out.println(cachorro2.idadeChip());
        System.out.println(cachorro2.adocao( cachorro2.getFerido() ,cachorro2.getPeso()));


    }

}
