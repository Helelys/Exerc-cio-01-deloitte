package Aula02.frota;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade = 0;

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

    public void acelerar() {
        System.out.printf("Você acelerou 10km!\n");
        double velocidadeAtual = getVelocidade() + 10;
        setVelocidade(velocidadeAtual);
    }

    public void desacelerar() {
        if (getVelocidade() > 0) {
            System.out.printf("Você desacelerou!");
            double velocidadeAtual = getVelocidade() - 10;
            setVelocidade(velocidadeAtual);
        } else {
            System.out.printf("Você está parado!\n");
        }
    }

    public void frear() {
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
}
