package modelosExercicios;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    @Override
    public String toString() {
        return "Cachorro: " + getNome() + " idade: " + getIdade();
    }

    public String erguerPatas() {
        return "Levantando patas de cachorro";
    }

}
