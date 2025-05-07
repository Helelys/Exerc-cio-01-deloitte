package Aula02.frota.frota;

import Aula02.frota.Veiculo;
import Aula02.frota.motoristas.Motorista;

import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Veiculo> veiculos;
    private List<Motorista> motoristas;

    public Frota(List<Veiculo> veiculos, List<Motorista> motoristas) {
        this.veiculos = veiculos;
        this.motoristas = motoristas;
    }

    public Frota() {
        veiculos = new ArrayList<>();
        motoristas = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void removerVeiculo(Veiculo veiculo) {
        veiculos.remove(veiculo);
    }

    public void adicionarMotorista(Motorista motorista) {
        motoristas.add(motorista);
    }

    public void removerMotorista(Motorista motorista) {
        motoristas.remove(motorista);
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public List<Motorista> getMotoristas() {
        return motoristas;
    }

    public void setMotoristas(List<Motorista> motoristas) {
        this.motoristas = motoristas;
    }

    @Override
    public String toString() {
        return "\nFrota{" +
                "\nveiculos=" + veiculos +
                "\n, motoristas=" + motoristas +
                "\n}";
    }
}
