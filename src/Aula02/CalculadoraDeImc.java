package Aula02;

public class CalculadoraDeImc {
    private double altura;
    private double peso;
    private double imc;

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public double CalcularImc() {
        double alturaAoQuadrado = getAltura() * getAltura();
        imc = getPeso() / alturaAoQuadrado;
        return imc;
    }

    public CalculadoraDeImc(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public void dizerImc() {
        if (imc < 18.5) {
            System.out.printf("Você está abaixo do peso, com o IMC de %.2f", imc);
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.printf("Você está no peso normal, com o IMC de %.2f", imc);
        } else if (imc >= 25.0 && imc < 29.9) {
            System.out.printf("Você está em sobrepeso, com IMC de %.2f", imc);
        } else if (imc >= 25.0 && imc < 34.9) {
            System.out.printf("Você está com obesidade grau 1, com IMC de %.2f", imc);
        } else if (imc > 35.0 && imc < 39.9) {
            System.out.printf("Você está com obesidade grau 2, com IMC de %.2f", imc);
        } else if (imc > 40.0) {
            System.out.printf("Você está com obesidade grua 3, com IMC de %.2f", imc);
        } else {
            System.out.printf("Valores inválidos.");
        }
    }
}
