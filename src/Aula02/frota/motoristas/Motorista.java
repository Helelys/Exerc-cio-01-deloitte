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
            System.out.printf("\n%s não tem veículo.\n", getNome());
        } else {
            System.out.printf("\n%s está dirigindo um %s %s\n", getNome(), getVeiculoAtual().getMarca(), getVeiculoAtual().getModelo());
        }
    }

    @Override
    public String toString() {
        if (getVeiculoAtual() == null) {
            return "Motorista{" +
                    "nome='" + nome + '\'' +
                    ", cnh='" + cnh + '\'' +
                    ", veiculoAtual= Não há veículo." +
                    '}';
        } else {
            return "Motorista{" +
                    "nome='" + nome + '\'' +
                    ", cnh='" + cnh + '\'' +
                    ", veiculoAtual=" + veiculoAtual +
                    '}';
        }
    }
}
