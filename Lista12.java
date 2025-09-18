package primeiroProjeto;

import java.util.Scanner;

public class Lista12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1

		int cont = 10;
		do {
			System.out.println(cont);
			cont++;
		} while (cont <= 30);

		System.out.println("==========");

		// 2

		int adivinha;
		do {
			System.out.println("Insira um número: ");
			adivinha = scanner.nextInt();
		} while (adivinha != 5);
		System.out.println("Você acertou!");

		System.out.println("==========");

		// 3

		int mala;
		do {
			System.out.println("Insira o peso da mala: ");
			mala = scanner.nextInt();
			if (mala <= 23) {
				System.out.println("Peso dentro do limite.");
			} else {
				System.out.println("Limite de peso excedido.");
			}
		} while (mala > 23);

		System.out.println("==========");

		// 4
		int pag = 1;
		int paginas = 0;
		do {
			System.out.println("Insira um valor: ");
			int livro = scanner.nextInt();
			paginas = paginas + livro;
			pag++;
		} while (pag <= 5);
		System.out.println("Você leu " + paginas + " páginas.");

		System.out.println("==========");
		// 5
		int codigo;
		do {
			System.out.println("Digite o código de acesso:");
			codigo = scanner.nextInt();
			if (codigo != 789) {
				System.out.println("Código incorreto. Tente novamente.");
			}
		} while (codigo != 789);
		System.out.println("Código correto! Acesso liberado.");

		System.out.println("==========");

		// 6
		int combustivel;
		do {
			System.out.println("Digite o nível de combustível:");
			combustivel = scanner.nextInt();
			if (combustivel <= 10) {
				System.out.println("Combustível baixo.");
			}
		} while (combustivel <= 10);
		System.out.println("Combustível suficiente.");

		System.out.println("==========");

		// 7
		int distancia;
		int totalKm = 0;
		do {
			System.out.println("Digite a distância percorrida:");
			distancia = scanner.nextInt();
			if (distancia > 0) {
				totalKm += distancia;
			}
		} while (distancia > 0);
		System.out.println("Total de quilômetros percorridos: " + totalKm);

		System.out.println("==========");
		

	}

}
