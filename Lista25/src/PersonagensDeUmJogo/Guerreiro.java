package PersonagensDeUmJogo;

public class Guerreiro extends Personagem {

    public Guerreiro() {
        super("Guerreiro");
    }

    @Override
    public void realizarAcao() {
        System.out.println("O guerreiro ataca com a espada!");
    }
}

