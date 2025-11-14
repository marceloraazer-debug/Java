package Restaurante;

import java.util.Scanner;

public class MainPrato {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um prato:");
        System.out.println("1 - Pizza");
        System.out.println("2 - Lasanha");
        System.out.println("3 - Salada");
        System.out.print("Opção: ");

        int opcao = sc.nextInt();

        Prato prato;

        if (opcao == 1) {
            prato = new Pizza();
        } else if (opcao == 2) {
            prato = new Lasanha();
        } else if (opcao == 3) {
            prato = new Salada();
        } else {
            System.out.println("Opção inválida!");
            return;
        }

        System.out.println("Prato escolhido: " + prato.nome);
        System.out.println("Preço: R$ " + prato.calcularPreco());

    }

}
