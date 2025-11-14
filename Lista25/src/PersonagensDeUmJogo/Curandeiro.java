package PersonagensDeUmJogo;

public class Curandeiro extends Personagem {

    public Curandeiro() {
        super("Curandeiro");
    }

    @Override
    public void realizarAcao() {
        System.out.println("O curandeiro cura um aliado!");
    }
}