package Aula02;

import java.util.regex.Pattern;

public class ValidaCPF {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void validadorDeCpf() {
        if (cpf.length() == 11) {
            System.out.printf("Cpf %s válido", cpf);
        } else {
            System.out.printf("Cpf %s inválido", cpf);
        }
    }

    public ValidaCPF(String cpf) {
        this.cpf = cpf;
    }
}
