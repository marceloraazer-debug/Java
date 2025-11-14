package PadariaPolimórfica;

import java.util.Scanner;

public class MainPadaria {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um produto para preparar:");
        System.out.println("1 - Pão");
        System.out.println("2 - Bolo");
        System.out.println("3 - Torta");
        System.out.print("Opção: ");

        int opcao = scanner.nextInt();

        ProdutoPadaria produto;

        if (opcao == 1) {
            produto = new Pao();
        } else if (opcao == 2) {
            produto = new Bolo();
        } else if (opcao == 3) {
            produto = new Torta();
        } else {
            System.out.println("Opção inválida!");
            return;
        }

        produto.preparar();

    }

}
