package Restaurante;

public class Lasanha extends Prato {

    public Lasanha() {
        super("Lasanha");
    }

    @Override
    public double calcularPreco() {
        return 28.0;
    }
}
