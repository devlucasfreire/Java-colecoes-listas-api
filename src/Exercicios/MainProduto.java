package Exercicios;

import modelosExercicios.Produto;

import java.util.ArrayList;

public class MainProduto {
    static void main(String[] args) {

        var produto = new Produto("Borracha Faber-Castel", 12.99, 50);
        var produto1 = new Produto("Lapiseira", 15.99, 10);
        var produto2 = new Produto("Caneta Azul Bic", 3.50, 100);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto);
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        System.out.println("Variedade de produtos disponíveis: " + listaProdutos.size());
        System.out.println(listaProdutos.get(0).getNome());
        System.out.println(listaProdutos);

    }