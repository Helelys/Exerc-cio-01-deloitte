package Aula02;

import Aula02.frota.motoristas.Motorista;
import Aula02.frota.veiculos.Caminhao;
import Aula02.frota.veiculos.Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /*
        System.out.println("Digite sua altura");
        double altura = teclado.nextDouble();

        System.out.println("Digite seu peso");
        double peso = teclado.nextDouble();

        CalculadoraDeImc tallysimc = new CalculadoraDeImc(altura, peso);
        tallysimc.CalcularImc();
        tallysimc.dizerImc();
         */ // Exercício 01, calculadora de IMC

        /*
        System.out.println("Digite um CPF");
        String cpf = teclado.next();

        ValidaCPF cpfTallys = new ValidaCPF(cpf);
        cpfTallys.validadorDeCpf();

         */ // Exercício 03, validador simples de CPF (Se há 11 dígitos)

        /*
        Produto produto1 = new Produto("Televisao", 100, 10);
        produto1.darDesconto();

         */ // Exercício 04, desconto de produto

        Caminhao caminhao = new Caminhao("Guerra", "Robusto", 2020, 50);
        Carro carro = new Carro("Renault", "Sandero", 2020, 4);

        Motorista carlos = new Motorista("Carlos", "123456789", carro);
        carlos.dirigir();
    }
}
