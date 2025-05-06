package Aula01.parte02;

public class Main1 {
    public static void main(String[] args) {
        Aula02.Pessoa pessoa1 = new Aula02.Pessoa("Tallys", 28);
        Aula02.Pessoa pessoa2 = new Aula02.Pessoa("Tulio", 28);

        pessoa1.autenticadorDeIdade();
        pessoa2.autenticadorDeIdade();

        if (pessoa1.getIdade() > pessoa2.getIdade()) {
            System.out.printf("%s é mais velho, pois tem %d anos enquanto %s tem apenas %d.\n", pessoa1.getNome(), pessoa1.getIdade(), pessoa2.getNome(), pessoa2.getIdade());
        } else if (pessoa1.getIdade() == pessoa2.getIdade()){
            System.out.printf("%s e %s tem a mesma idade, pois ambos tem %d anos.\n", pessoa1.getNome(), pessoa2.getNome(), pessoa1.getIdade());
        } else {
            System.out.printf("%s é mais velho, pois tem %d anos enquanto %s tem apenas %d.\n", pessoa2.getNome(), pessoa2.getIdade(), pessoa1.getNome(), pessoa1.getIdade());
        }
    }
}
