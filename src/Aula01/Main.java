package Aula01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /*
        System.out.println("Digite o primeiro número");
        double primeiroNumero = teclado.nextDouble();

        System.out.println("Digite o segundo número");
        double segundoNumero = teclado.nextDouble();

        double soma = primeiroNumero + segundoNumero;

        System.out.println("A soma deles é: " + soma);

         */ // Exercício 1

        /*
        System.out.println("Digite um número: ");
        int numeroDigitado = teclado.nextInt();

        if (numeroDigitado % 2 == 0) {
            System.out.printf("O número %d é par.", numeroDigitado);
        } else {
            System.out.printf("O número %d é ímpar.", numeroDigitado);
        }

         */ // Exercício 2

        /*
        System.out.println("Digite a primeira nota: ");
        double nota1 = teclado.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = teclado.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = teclado.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media < 7) {
            System.out.printf("Você foi reprovado com média: %.2f", media);
        } else {
            System.out.printf("você foi aprovado com média: %.2f", media);
        }

         */ // Exercício 3

        /*
        System.out.println("Digite um número e veremos a tabuada do mesmo: ");
        int numero = teclado.nextInt();

        for (int i = 1; i <= 10; i++) {
            int tabuada = numero * i;
            System.out.printf("O número %d * %d é: %d\n", numero, i, tabuada);
        }

         */ // Exercício 4

        //teste

        teclado.close();
    }
}