package queue;
public class ContaBancaria {
    private String nomeTitular;
    private int conta;
    private double saldo;

    public ContaBancaria(String nomeTitular, int conta) {
        this.nomeTitular = nomeTitular;
        this.conta = conta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
