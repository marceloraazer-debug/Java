package primeiroProjeto;

import java.util.Scanner;

public class Lista9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1- Contador
		int numeros = 1;
		while(numeros <= 10) {
			System.out.println(numeros);
			numeros++; // +1
		}
		System.out.println("\n" + "------" + "\n");
		
		// 2- Contagem Regressiva
		int regressiva = 10;
		while(regressiva >= 1) {
			System.out.println(regressiva);
			regressiva--; //-1
		}
		System.out.println("\n" + "------" + "\n");
		
		// 3- Sequência Numérica
		int cem = 5;
		while(cem <= 100) {
			System.out.println(cem);
			cem+=5; //-1
		}
		System.out.println("\n" + "------" + "\n");
		
		// 4- Mostrando Mensagem
		int java = 1;
		while(java <= 5) {
			System.out.println("Eu gosto de Java");
			java++; // +1
		}
		System.out.println("\n" + "------" + "\n");
		
		// 5- Soma de Números Digitados
		int valor;
		int soma = 0;
		int contador = 1;
		
		System.out.println("Digite cinco números inteiros: ");
		while(contador <= 5) {
			valor = scanner.nextInt();
			soma += valor;
			contador+=1;
		}
		System.out.println("A soma dos números é: "+ soma);
		System.out.println("\n" + "------" + "\n");
		
		// 6- Validação de Senha
		System.out.println("Digite uma senha para sair do sistema: ");
		String senha = scanner.next();
		
		while(!senha.equalsIgnoreCase("1234")) {
			System.out.println("Tente novamente.");
			senha = scanner.next();
		}
		System.out.println("Você conseguiu sair!");
		System.out.println("\n" + "------" + "\n");
		
		// 7- Contagem regressiva
		System.out.print("Digite um número inteiro positivo: ");
        int cont = scanner.nextInt();
        while (cont >= 1) {
            System.out.println(cont);
            cont--; 
        }

	}

}
