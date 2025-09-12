package primeiroProjeto;

import java.util.Scanner;

public class Lista10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 1 - Contador
		int contador = 10;
		while(contador <= 30) {
			System.out.println(contador);
			contador++; //+1
		}
		
		System.out.println("\n" + "------" + "\n");
		
		// 2 - Soma de Números Digitador:
		int digitador = 1;
		int soma1 = 0;
		
		while(digitador <= 3) {
			System.out.println("Digite o número "+ digitador +": ");
			int numero = scanner.nextInt();
			soma1 = soma1 + numero;
			digitador++;
		}
		System.out.println("A soma é: "+ soma1);

		System.out.println("\n" + "------" + "\n");
		
		// 3 - Multiplicação de Números Digitados:
		int multiplicador = 1;
		int mult = 1;
		
		while(multiplicador <= 5) {
			System.out.println("Digite o número "+ multiplicador +": ");
			int numero2 = scanner.nextInt();
			mult = mult * numero2;
			multiplicador++;
		}
		System.out.println("A multiplicação é: "+ mult);
		
		System.out.println("\n" + "------" + "\n");
		
		// 4 - Contar até o número informado:
		System.out.print("Digite um número inteiro: ");
        int num1 = scanner.nextInt();
        int contadorr = 1;
        while (contadorr <= num1) {
            System.out.println(contadorr);
            contadorr++; 
        }
        
        System.out.println("\n" + "------" + "\n");
		
        // 5 - Somar os números de 1 a 5:
        int d = 1;
		int s = 0;
		
		while(d <= 5) {
			s = s + d;
			d++;
		}
		System.out.println("A soma dos valores de 1 a 5 é: "+ s);
		System.out.println("\n" + "------" + "\n");
		
		// 6 - Tabuada
		System.out.println("---------------");
		System.out.println("Digite um número para ver a tabuada: ");
		int tabuada = scanner.nextInt();
		int i = 1;
		while (i <= 10) {
			System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
			i++;
		}
		
				
		
		
		
		
		
		
		
		
	}

}
