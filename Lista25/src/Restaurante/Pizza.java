package Restaurante;

public class Pizza extends Prato {

    public Pizza() {
        super("Pizza");
    }

    @Override
    public double calcularPreco() {
        return 35.0;
    }
}
