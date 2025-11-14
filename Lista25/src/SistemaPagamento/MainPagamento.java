package SistemaPagamento;

import java.util.Scanner;

public class MainPagamento {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o método de pagamento:");
        System.out.println("1 - Pix");
        System.out.println("2 - Cartão de Crédito");
        System.out.println("3 - Dinheiro");
        System.out.print("Opção: ");

        int opcao = sc.nextInt();

        Pagamento pagamento;

        if (opcao == 1) {
            pagamento = new Pix();
        } else if (opcao == 2) {
            pagamento = new CartaoCredito();
        } else if (opcao == 3) {
            pagamento = new Dinheiro();
        } else {
            System.out.println("Opção inválida!");
            return;
        }

        pagamento.processarPagamento();

	}

}
