package Produto;

public class ProdutosTestar {

    public static void main(String[] args) {

        // Construtor padrão:
        Produtos p1 = new Produtos();
        p1.nome = "Caneta Preta";
        p1.marca = "Bic";
        p1.valor = 1.50f;

        // Construtor de dois parâmetros:
        Produtos p2 = new Produtos("Caneta Vermelha", "Faber");
        p2.valor = 1.69f;

        // Construtor de três parâmetros:
        Produtos p3 = new Produtos("Borracha", "Mercur", 1.89f);

        // Armazena os objetos em um array
        Produtos[] produtos = { p1, p2, p3 };

        // Itera sobre o array para imprimir os objetos
        for (Produtos produto : produtos) {
            System.out.println("Nome: " + produto.nome + 
                               " Marca: " + produto.marca + 
                               " Valor: R$ " + produto.valor);
        }
    }
}
