package Restaurante;

public class Salada extends Prato {

    public Salada() {
        super("Salada");
    }

    @Override
    public double calcularPreco() {
        return 18.0;
    }
}