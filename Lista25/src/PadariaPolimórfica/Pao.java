package PadariaPolimórfica;

public class Pao extends ProdutoPadaria{
    public Pao() {
        super("Pão");
    }

    @Override
    public void preparar() {
        System.out.println("Assando pão crocante!");
    }

}
