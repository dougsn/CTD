package Aula04_ChainOfResponsibilityPatterns.Mesa;
public class GerenciadorEmbalagem extends Gerenciador{

    @Override
    public void verificar(Artigo produto) {
        if (produto.getEmbalagem().equalsIgnoreCase("saudável") ||
                produto.getEmbalagem().equalsIgnoreCase("quase saudável")) {
            System.out.println(produto.getNome() + " - Produto foi APROVADO!");
        }
        else {
            System.out.println(produto.getNome() + " - REJEITADO - Embalagem fora dos parâmetros.");
        }
    }
}