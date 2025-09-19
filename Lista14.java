package primeiroProjeto;

import java.util.Scanner;

public class Lista14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1
		for (int cont = 1; cont <= 10; cont++) { // +1
			System.out.println(cont);
		}

		System.out.println("======");
		// 2
		int soma = 0;
		for (int i = 1; i <= 100; i++) {
			soma += i;
			System.out.println("A soma de " + i + " é: " + soma);
		}
		System.out.println("O resultado é: " + soma);
		System.out.println("======");
		// 3
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("======");
		// 4
		System.out.println("Digite um número e descubra a tabuada até 10: ");
		int tabuada = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(tabuada + "x" + i + "=" + (tabuada * i));
		}
		System.out.println("======");
		// 5
		int numdiv = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				numdiv++;
			}
		}
		System.out.println("Há " + numdiv + " números divisíveis por 3 entre 1 e 50");
		System.out.println("======");
		// 6
		System.out.println("Digite um número N: ");
		int n = scanner.nextInt();
		System.out.println("Números ímpares até " + n + ":");
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		System.out.println("======");
		// 7
		int mu = 1;
		for (int i = 1; i <= 5; i++) {
			System.out.println("Informe um valor N°" + i + ": ");
			int valor = scanner.nextInt();
			mu *= valor;
		}
		System.out.println("O resultado da multiplicação é: " + mu);
		System.out.println("======");
		// 8
		for (int i = 1; i <= 10; i++) {
			System.out.println("Informe o tempo" + i + ":");
			int anos = scanner.nextInt();
			if (anos > 10) {
				System.out.println("Parabéns! Você irá receber um prêmio.");
			} else {
				System.out.println("Quase lá");
			}
		}
		System.out.println("======");

	}

}
