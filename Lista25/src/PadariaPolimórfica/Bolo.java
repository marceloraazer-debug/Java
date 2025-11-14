package PadariaPolimórfica;

public class Bolo extends ProdutoPadaria{
    public Bolo() {
        super("Bolo");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando bolo confeitado!");
    }
}
