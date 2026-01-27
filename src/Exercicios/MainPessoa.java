package Exercicios;

import modelosExercicios.Pessoa;

import java.util.ArrayList;

public class MainPessoa {
   public static void main(String[] args) {

       var pessoa = new Pessoa();

       pessoa.setNome("Lucas Lopes Freire");
       pessoa.setIdade(22);

       System.out.println();
       System.out.println(pessoa);

       var pessoa1 = new Pessoa();

       pessoa1.setNome("Fernando José Fialho");
       pessoa1.setIdade(22);

       var pessoa2 = new Pessoa();

       pessoa2.setNome("Matheus da Silva Lima");
       pessoa2.setIdade(21);

       ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
       listaDePessoas.add(pessoa);
       listaDePessoas.add(pessoa1);
       listaDePessoas.add(pessoa2);
       System.out.println(listaDePessoas.get(0).getNome());
       System.out.println("Quantidade de pessoas: " + listaDePessoas.size());
       System.out.println(listaDePessoas);

       System.out.println("--- Lista de Membros ---");
       for (Pessoa p : listaDePessoas) {
           System.out.println(p);
       }
    }
}