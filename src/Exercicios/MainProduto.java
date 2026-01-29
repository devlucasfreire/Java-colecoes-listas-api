package Exercicios;

import modelosExercicios.Produto;
import modelosExercicios.ProdutoPerecivel;

import java.util.ArrayList;

public class MainProduto {
    public static void main(String[] args) {



        var produto = new Produto("Borracha Faber-Castel", 12.99, 50);
        var produto1 = new Produto("Lapiseira", 15.99, 10);
        var produto2 = new Produto("Caneta Azul Bic", 3.50, 100);

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Bolacha Rechada Sabor Chocolate", 3.99, 5, 2027);

        double somaPrecos = 0;
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto);
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produtoPerecivel);
        System.out.println("Variedade de produtos disponíveis: " + listaProdutos.size());
        System.out.println(listaProdutos.get(0).getNome());


        System.out.println("--- Lista de Produtos ---");
        for (Produto product : listaProdutos) {
            System.out.println(product);
            somaPrecos += product.getPreco();
        }
            double precoMedio = somaPrecos / listaProdutos.size();

        System.out.printf("Soma total dos preços: %.2f%n", somaPrecos);
        System.out.printf("O preço médio de valores dos itens: %.2f%n", precoMedio);


    }



}
