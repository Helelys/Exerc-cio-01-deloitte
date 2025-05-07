package Aula02.frota.veiculos;

import Aula02.frota.Veiculo;
import Aula02.frota.motoristas.Motorista;

public class Caminhao extends Veiculo {
    private double capacidade_carga;

    public double getCapacidade_carga() {
        return capacidade_carga;
    }

    public void setCapacidade_carga(double capacidade_carga) {
        this.capacidade_carga = capacidade_carga;
    }

    public Caminhao(String marca, String modelo, int ano, double velocidadeMaxima, double capacidade_carga) {
        super(marca, modelo, ano, velocidadeMaxima);
        this.capacidade_carga = capacidade_carga;
    }

    public Caminhao(String marca, String modelo, int ano, Motorista motorista, double capacidade_carga) {
        super(marca, modelo, ano, motorista);
        this.capacidade_carga = capacidade_carga;
    }

    @Override
    public String toString() {
        return super.toString() + "Caminhao{" +
                "capacidade_carga=" + capacidade_carga +
                '}';
    }
}
