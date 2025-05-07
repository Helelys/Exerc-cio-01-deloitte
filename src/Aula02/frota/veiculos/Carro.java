package Aula02.frota.veiculos;

import Aula02.frota.Veiculo;

public class Carro extends Veiculo {
    private int num_portas;

    public Carro(String marca, String modelo, int ano, int cambio, double velocidadeMaxima, int num_portas) {
        super(marca, modelo, ano, cambio, velocidadeMaxima);
        this.num_portas = num_portas;
    }

    public int getNum_portas() {
        return num_portas;
    }

    public void setNum_portas(int num_portas) {
        this.num_portas = num_portas;
    }

    @Override
    public String toString() {
        return super.toString() + "Carro{" +
                "num_portas=" + num_portas +
                '}';
    }
}
