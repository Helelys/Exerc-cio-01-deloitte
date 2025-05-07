package Aula02.frota;

import Aula02.frota.motoristas.Motorista;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade = 0;
    private Motorista motorista;

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(Motorista motorista) {
        System.out.printf("%s acelerou 10km!/h\n", motorista.getNome());
        double velocidadeAtual = getVelocidade() + 10;
        setVelocidade(velocidadeAtual);
    }

    public void desacelerar(Motorista motorista) {
        if (getVelocidade() > 0) {
            System.out.printf("%s desacelerou 10Km/h\n", motorista.getNome());
            double velocidadeAtual = getVelocidade() - 10;
            setVelocidade(velocidadeAtual);
        } else {
            System.out.printf("%s está parado!\n", motorista.getNome());
        }
    }

    public void frear(Motorista motorista) {
        if (getVelocidade() > 0) {
            System.out.printf("Você freou!\n");
            setVelocidade(0);
        }
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", velocidade=" + velocidade +
                '}';
    }

    public void velocidadeAtual() {
        System.out.printf("Sua velocidade atual é: %.2f KM por hora.\n", getVelocidade());
    }

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, int ano, Motorista motorista) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motorista = motorista;
    }
}
