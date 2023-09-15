public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;

    public Carro(String marca, String modelo, int ano, double velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public void acelerar(double novaVelo) {
        this.velocidade += novaVelo;
    }

    public void desacelerar(double novaVelo) {
        if (novaVelo <= this.velocidade) {
            this.velocidade -= novaVelo;
        }
    }
}
