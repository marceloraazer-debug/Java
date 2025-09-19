package primeiroProjeto;

import java.util.Scanner;

public class Lista15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1
		String[] frutas = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("fruta [" + i + "]: ");
			frutas[i] = scanner.next();
		}
		System.out.println("Mostrando as frutas escolhidas.");
		for (int i = 0; i < 5; i++) {
			System.out.println(frutas[i]);
		}

		System.out.println("=====");

		// 2
		int[] numeros = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("número [" + i + "]: ");
			numeros[i] = scanner.nextInt();
		}
		System.out.println("Mostrando os números escolhidos.");
		for (int i = 0; i < 10; i++) {
			System.out.println(numeros[i]);
		}

		System.out.println("=====");

		// 3
		int[] inversa = new int[7];
		for (int i = 0; i < 7; i++) {
			System.out.println("valor [" + i + "]: ");
			inversa[i] = scanner.nextInt();
		}
		System.out.println("Valores invertidos:");
		for (int i = 6; i >= 0; i--) {
			System.out.println(inversa[i]);
		}

		System.out.println("=====");

		// 4
		int[] maiores = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("valor [" + i + "]: ");
			maiores[i] = scanner.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			if (maiores[i] > 100) {
				System.out.println(maiores[i] + " Maior que cem.");
			}
		}

		System.out.println("=====");
		// 5
		int[] vetor = new int[8];
		for (int i = 0; i < 8; i++) {
			System.out.println("Digite um número (" + (i) + "): ");
			vetor[i] = scanner.nextInt();
		}
		System.out.println("Digite um número para ser procurado: ");
		int procurar = scanner.nextInt();
		boolean achar = false;
		for (int i = 0; i < 8; i++) {
			if (vetor[i] == procurar) {
				achar = true;
				break;
			}
		}
		if (achar) {
			System.out.println("O número " + procurar + " já existe no vetor!");
		} else {
			System.out.println("O número " + procurar + " não foi encontrado.");
		}

		System.out.println("=====");
		// 6
		String[] nomes = new String[5];
		int[] idades = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o nome da pessoa " + (i + 1) + ": ");
			nomes[i] = scanner.next();
			System.out.println("Digite a idade de " + nomes[i] + ": ");
			idades[i] = scanner.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(nomes[i] + " tem " + idades[i] + " anos");
		}
		
		System.out.println("=====");
		// 7
		int[] idd = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("valor [" + i + "]: ");
			idd[i] = scanner.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			if (idd[i] < 18) {
				System.out.println(idd[i] + " Menor de idade.");
			}
		}
		
		System.out.println("=====");
		//8
		int[] massa = new int[7];
		for (int i = 0; i < 7; i++) {
			System.out.println("salário [" + i + "]: ");
			massa[i] = scanner.nextInt();
		}
		for (int i = 0; i < 7; i++) {
			if (massa[i] < 2500) {
				System.out.println(massa[i] + " Você receberá um aumento.");
			}
		}
		
		
		

	}

}
