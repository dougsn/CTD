public class Main {
    public static void main(String[] args) {
//
//        Artigo artigo = new Artigo("Artigo 1", 1100.00,100 );
//
//        if(artigo.temEstoque() > 0){
//            System.out.println("Tem estoque disponível");
//        }
//
//        System.out.println("O preço da venda é " + artigo.consultarPreco());
//
//
//
//        Caminhao meuCaminhao = new Caminhao("Ford","AB XXX CD");
//
//        Caminhao.mudarPrecoCombustivel(98.50);
//
//
//        System.out.println("Gasto com combustível: " + meuCaminhao.gastoCombustivel(40));


//        newCaminhao caminhaoTeste = new newCaminhao("Ford","ABC DDD EE");
//
//        newCaminhao.mudarPrecoCombustivel(98.50);
//
//        System.out.println("Gasto com o combustível: " + newCaminhao.precoCombustivel(40));

//        Cliente cliente = new Cliente(1, "Pedro");
//
//        cliente.aumetarDivida(10.52);
//        cliente.pagarDivida(10.52);
//        cliente.pagarDivida(10.52);
//        cliente.setDivida(5.0); // Pode ser acessado só por causa do protected. Se fosse private não daria.
//
//        System.out.println("Sua divida é de: " + cliente.getDivida());


        // Mesa de Trabalho


        UsuarioJogo usuario1 = new UsuarioJogo("Douglas","dougsn");
        usuario1.aumentarPontuacao();
        usuario1.aumentarPontuacao();
        usuario1.subirNivel();
        usuario1.subirNivel();


        UsuarioJogo usuario2 = new UsuarioJogo("Rodrigo", "drigosn");
        usuario2.subirNivel();
        usuario2.bonus(4);


        System.out.println(
                "-----------------------------" + System.lineSeparator() +
                "Nome do jogador 1: " + usuario1.getNome() + System.lineSeparator() +
                "Pontuação do " + usuario1.getNome() + ": " + usuario1.getPontuacao() + System.lineSeparator() +
                "Nível do " + usuario1.getNickname() + ": " + usuario1.getNivel() + System.lineSeparator() +
                "----------------------------" + System.lineSeparator() +
                "Nome do jogador 2: " + usuario2.getNome() + System.lineSeparator() +
                "Pontuação do " + usuario2.getNome() + ": " + usuario2.getPontuacao() + System.lineSeparator() +
                "Nível do " + usuario2.getNickname() + ": " + usuario2.getNivel() + System.lineSeparator() +
                "-----------------------------"
                );



    }


}
