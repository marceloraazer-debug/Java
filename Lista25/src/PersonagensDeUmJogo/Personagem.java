package PersonagensDeUmJogo;

public class Personagem {
    protected String nome;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public void realizarAcao() {
        System.out.println("O personagem realiza uma ação.");
    }
}
