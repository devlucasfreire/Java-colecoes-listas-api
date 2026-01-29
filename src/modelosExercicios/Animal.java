package modelosExercicios;

public class Animal {
    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("Som genérico de animal");
    }

    @Override
    public String toString() {
        return "Animal: " + getNome() + " idade: " + getIdade();
    }

}
