import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        // PG exercicio 1 - Variáveis

//        String txt1 = "Olá";
//        String txt2 = "Olá";
//
//        if(txt1.equals(txt2)){
//            System.out.println("Os textos são iguais");
//        } else {
//            System.out.println("O texto 1 é " + txt1 + " e o texto 2 é " + txt2);
//        }


//        // PG exercicio 2 - Variáveis
//        Integer num1 = 4;
//        Integer num2 = 4;
//
//        if(num1 > num2 ){
//            System.out.println("O " + num1 + " é maior que " + num2);
//        }else if(num1 < num2){
//            System.out.println("O " + num2 + " é maior que " + num1);
//        }else {
//            System.out.println("Os números são iguais");
//        }
//        ;

        // PG exericio - Scanner

        Scanner scanner = new Scanner(System.in);



//        Scanner scanner = new Scanner(System.in);

//        int num3;
//        int num4;
//        float coeficiente;
//        String nome;
//        char inicial;
//
//
//        System.out.println("Insira um primeiro número: ");
//        num3 = scanner.nextInt();
//        System.out.println("Insira um segundo número: ");
//        num4 = scanner.nextInt();
//
//        System.out.println("Insira o coeficiente: ");
//        coeficiente = scanner.nextFloat();
//
//
//
//        System.out.println("Insira o seu nome: ");
//        nome = scanner.nextLine();

        // Aula ao vivo
        // Para resolver o problema da formatação do 0 no int, podemos trocar o int por String, ou usar o String.format("%02d", mes) nos locais que podem ter o 0;


        System.out.println("Escreva o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();
        // O valueOf transforma o valor em strig, podemos usar o "" nome começo tbm..
        String iniciais = String.valueOf(nome.charAt(0)) + sobrenome.charAt(0) ;

        System.out.println("Digite o dia do seu nascimento: ");
        int dia = scanner.nextInt();

        System.out.println("Digite o mês do seu nascimento: ");
        int mes = scanner.nextInt();

        System.out.println("Digite o ano do seu nascimento: ");
        int ano = scanner.nextInt();

        System.out.println("Seu nome é: " + nome + " " + iniciais + " " + sobrenome);
        System.out.println("Minha data de nascimento: " + String.format("%02d", dia) + "/" + String.format("%02d", mes) + "/" + ano);




    }
}
