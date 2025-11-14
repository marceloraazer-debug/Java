package ContasBancarias;

import java.util.Scanner;

public class MainConta {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println("Escolha o tipo de conta:");
        System.out.println("1 - Conta Poupança");
        System.out.println("2 - Conta Investimento");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        Conta conta;

        if (opcao == 1) {
            conta = new ContaPoupanca(saldo);
        } else if (opcao == 2) {
            conta = new ContaInvestimento(saldo);
        } else {
            System.out.println("Opção inválida!");
            return;
        }

        System.out.println("Rendimento: R$ " + conta.calcularRendimento());

        scanner.close();
    }

}
