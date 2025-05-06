package Aula02;

public class Produto {
    private String produtoNome;
    private double produtoPreco;
    private double produtoDesconto;

    public void darDesconto() {
        double descontoAplicado = produtoDesconto / 100.0;
        double produtoDescontado = (produtoPreco * descontoAplicado);
        System.out.printf("O desconto para o produto %s é de %.2f", produtoNome, (produtoPreco - produtoDescontado));
    }

    public Produto(String produtoNome, double produtoPreco, double produtoDesconto) {
        this.produtoNome = produtoNome;
        this.produtoPreco = produtoPreco;
        this.produtoDesconto = produtoDesconto;
    }
}
