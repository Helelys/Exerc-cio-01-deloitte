package Aula02.frota;

public class Caminhao extends Veiculo{
    private double capacidade_carga;

    public double getCapacidade_carga() {
        return capacidade_carga;
    }

    public void setCapacidade_carga(double capacidade_carga) {
        this.capacidade_carga = capacidade_carga;
    }

    public Caminhao(String marca, String modelo, int ano, double capacidade_carga) {
        super(marca, modelo, ano);
        this.capacidade_carga = capacidade_carga;
    }

    @Override
    public String toString() {
        return super.toString() + "Caminhao{" +
                "capacidade_carga=" + capacidade_carga +
                '}';
    }
}
