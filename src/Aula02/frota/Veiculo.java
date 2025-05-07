package Aula02.frota;

import Aula02.frota.motoristas.Motorista;

import java.util.Random;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade = 0;
    private Motorista motorista;
    private int cambio = 1;
    private double velocidadeMaxima;
    Random randomNumero = new Random();
    private int chanceDeMorrer = randomNumero.nextInt(10) + 1;

    public int getCambio() {
        return cambio;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

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
        if (getVelocidade() > 0 && getVelocidade() < 20) {
            System.out.println("Você freou!");
            setVelocidade(0);
        } else if (getVelocidade() > 20 && getVelocidade() < 40) {
            System.out.println("Você capotou! Suas chances de sobrevivência são boas! Você...");
            if (chanceDeMorrer > 2) {
                System.out.println("Você sobreviveu!");
            } else {
                System.out.println("Você morreu. Notificaremos sua família.");
                setMotorista(null);
            }
        } else if (getVelocidade() > 40 && getVelocidade() < 60 ) {
            System.out.println("Você capotou! Suas chances de sobrevivência são complicadas, mas você...");
            if (chanceDeMorrer > 4) {
                System.out.println("Você sobreviveu.");
            } else {
                System.out.println("Você morreu. Notificaremos sua família.");
                setMotorista(null);
            }
        } else if (getVelocidade() > 60) {
            System.out.println("Você capotou! Suas chances de sobreviver são baixas, você...");
            if (chanceDeMorrer > 6) {
                System.out.println("Você sobreviveu!");
            } else {
                System.out.println("Você morreu. Notificaremos sua família.");
                setMotorista(null);
            }
        } else if (getVelocidade() == getVelocidadeMaxima()) {
            System.out.println("Você capotou! Suas chances de sobrevivência são péssimas, você... ");
            if (chanceDeMorrer > 9) {
                System.out.println("Você sobreviveu!");
            } else {
                System.out.println("Você morreu. Notificaremos sua família.");
                setMotorista(null);
            }
        } else {
            System.out.println("Você está muito rápido para frear! Vamos desacelerar.");
            desacelerar(motorista);
        }
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", velocidade máxima=" + velocidadeMaxima +
                '}';
    }

    public void velocidadeAtual() {
        System.out.printf("Sua velocidade atual é: %.2f KM por hora.\n", getVelocidade());
    }

    public Veiculo(String marca, String modelo, int ano, int cambio, double velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cambio = cambio;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Veiculo() {
    }
}
