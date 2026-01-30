package modelosExercicios;

public class ContaBancaria {
    private String nomeConta;
    private int numeroConta;
    private double saldoConta;

    public ContaBancaria(String nomeConta, int numeroConta, double saldoConta) {
        this.nomeConta = nomeConta;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    @Override
    public String toString() {
        return "Conta com maior saldo: " + nomeConta + " .Com o saldo de: R$" + getSaldoConta();
    }
}
