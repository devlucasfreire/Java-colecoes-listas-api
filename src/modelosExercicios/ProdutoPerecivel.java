package modelosExercicios;

public class ProdutoPerecivel extends Produto{
    int anoValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, int anoValidade) {
        super(nome, preco, quantidade);
        this.anoValidade = anoValidade;
    }

    @Override
    public String toString() {
        return super.toString() + " | Validade: " + anoValidade;
    }
}
