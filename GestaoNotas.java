package primeiroProjeto;

import java.util.Scanner;

public class GestaoNotas {

	public static void main(String[] args) {{
			Scanner scanner = new Scanner(System.in);
			String continuar;

			do {
				System.out.print("Digite o nome do aluno: ");
				String nome = scanner.nextLine();

				System.out.print("Digite o ano do aluno: ");
				int ano = scanner.nextInt();

				double[] notas = new double[3];
				for (int i = 0; i < 3; i++) {
					do {
						System.out.print("Digite a nota " + (i + 1) + " (0 a 10): ");
						notas[i] = scanner.nextDouble();
						if (notas[i] < 0 || notas[i] > 10) {
							System.out.println("Valor inválido, insira um valor dentro do intervalo de 0 a 10.");
						}
					} while (notas[i] < 0 || notas[i] > 10);
				}

				double soma = 0;
				for (int i = 0; i < 3; i++) {
					soma += notas[i];
				}
				double media = soma / 3;

				String classificacao;
				if (media < 5) {
					classificacao = "Reprovado";
				} else if (media >= 5 && media <= 7) {
					classificacao = "Recuperação";
				} else {
					classificacao = "Aprovado";
				}

				System.out.println("====== Resumo do Aluno ======");
				System.out.println("Nome: " + nome);
				for (int i = 0; i < 3; i++) {
					System.out.println("Nota " + (i + 1) + ": " + notas[i]);
				}
				System.out.println("Média: " + media);
				System.out.println("Classificação: " + classificacao);
				System.out.println("=============================");

				System.out.print("Deseja verificar outro aluno? (sim/não): ");
				scanner.nextLine(); 
				continuar = scanner.nextLine();

			} while (continuar.equalsIgnoreCase("sim"));

			System.out.println("Sistema finalizado.");
		}
	}

}
