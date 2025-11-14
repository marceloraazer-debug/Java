package PersonagensDeUmJogo;

import java.util.Scanner;

public class MainPersonagem {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um personagem:");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");
        System.out.println("3 - Curandeiro");
        System.out.print("Opção: ");

        int opcao = sc.nextInt();

        Personagem p;

        if (opcao == 1) {
            p = new Guerreiro();
        } else if (opcao == 2) {
            p = new Mago();
        } else if (opcao == 3) {
            p = new Curandeiro();
        } else {
            System.out.println("Opção inválida!");
            return;
        }

        p.realizarAcao();
    }
}
