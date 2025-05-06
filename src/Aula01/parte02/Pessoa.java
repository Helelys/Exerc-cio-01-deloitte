package Aula02;

public class Pessoa {
    private String nome;
    private int idade;

    public void autenticadorDeIdade() {
        if (idade < 18) {
            System.out.printf("%s é de menor, pois tem apenas %d anos.\n", nome, idade);
        } else {
            System.out.printf("%s é de maior, pois tem %d anos.\n", nome, idade);
        }
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
