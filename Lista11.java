package primeiroProjeto;

import java.util.Scanner;

public class Lista11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1 - Contador
		int contador = 1;
		while(contador <= 32) {
			System.out.println(contador);
			contador += 2;
		}
		
		System.out.println("------");
		
		//2 - Advinhação de número
		int numero = 100;
		int escolha = 0;
		do {
			System.out.println("Informe um número: ");
			escolha = scanner.nextInt();
		} while (numero != escolha);
		System.out.println("Acertou!");
		
		System.out.println("------");
		
		//3 - Menu Interativo
		
		int opcao1;
		do {
			System.out.println("Escolha uma opção do menu:");
			System.out.println("1 - Continuar");
			System.out.println("2 - Sair");
			opcao1 = scanner.nextInt();
			if (opcao1 == 1) {
			System.out.println("Você escolheu continuar.");
			} else if (opcao1 == 2) {
			System.out.println("Você escolheu sair.");
			} else {
			System.out.println("Opção inválida.");
			}
		} while(opcao1 != 2);
		System.out.println("Programa encerrado.");
		
		System.out.println("------");
		
		//4 - Classificação de números:
		int numeross;
		int cont = 1;
		do {
			System.out.println("Informe um valor: ");
			numeross = scanner.nextInt();
			if(numeross<10) {
				System.out.println("TIPO A");
			} else if (numeross<20){
				System.out.println("TIPO B");
			} else {
				System.out.println("Fora da categoria");
			}
			cont++;
		} while(cont <= 5);
		System.out.println("FIM");
		
		System.out.println("------");
		
		// 5 - Temperatura do forno
        System.out.println("------------------------");
        int temperatura;
        do {
            System.out.println("Digite a temperatura do forno:");
            temperatura = scanner.nextInt();

            if (temperatura >= 200) {
                System.out.println("ALERTA! Temperatura muito alta!");
            }
        } while (temperatura >= 200);
        System.out.println("Temperatura dentro da faixa segura!");

        System.out.println("------");
        
        // 6 - Verificação de bateria
        System.out.println("------------------------");
        int bateria;
        do {
            System.out.println("Digite o nível da bateria (%):");
            bateria = scanner.nextInt();

            if (bateria <= 20) {
                System.out.println("Bateria baixa!");
            }
        } while (bateria <= 20);
        System.out.println("Bateria em nível seguro!");
        
        System.out.println("------");

        // 7 - Deseja fazer uma conta?
        System.out.println("------------------------");
        String resposta;
        System.out.println("Deseja fazer uma conta?");
        resposta = scanner.next();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Digite o primeiro número:");
            int n1 = scanner.nextInt();
            System.out.println("Digite o segundo número:");
            int n2 = scanner.nextInt();
            int soma = n1 + n2;
            System.out.println("Resultado da soma: " + soma);
        } else {
      
        }

		
		
		
		
		
		
		
		
		
		
		
	}

}
