package Aula02.frota.motoristas;

import Aula02.frota.Veiculo;

public class Motorista{
    private String nome;
    private String cnh;
    private Veiculo veiculoAtual;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Veiculo getVeiculoAtual() {
        return veiculoAtual;
    }

    public void setVeiculoAtual(Veiculo veiculoAtual) {
        this.veiculoAtual = veiculoAtual;
    }

    public Motorista(String nome, String cnh, Veiculo veiculoAtual) {
        this.nome = nome;
        this.cnh = cnh;
        this.veiculoAtual = veiculoAtual;
    }

    public Motorista(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
    }

    public void atribuirVeiculo(Veiculo veiculo) {
        setVeiculoAtual(veiculo);
    }

    public void removerVeiculo() {
        setVeiculoAtual(null);
    }

    public void dirigir() {
        if (getVeiculoAtual() == null) {
            System.out.printf("%s não tem veículo.", getNome());
        } else {
            System.out.printf("%s está dirigindo um %s %s", getNome(), getVeiculoAtual().getMarca(), getVeiculoAtual().getModelo());
        }
    }
}
