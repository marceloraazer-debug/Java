package primeiroProjeto;

import java.util.Scanner;

public class Primeira {

	public static void main(String[] args) {
		System.out.println("Olá Mundo!");
		
		// Declaração de Variável
		int idade = 24;
		double salario = 2000.50;
		char letra = 'M';
		String nome = "Marcelo";
		boolean chuva = false;
		
		System.out.println(idade);
		System.out.println("O salário é: " + salario);
		System.out.println("A letra é: " + letra);
		System.out.println("O nome é: " + nome);
		System.out.println(chuva); 
		
		System.out.println("\n");
		
		//Operadores
		
		int num1 = 10;
		int num2 = 3;
		double soma = num1 + num2;
		double sub = num1 - num2;
		double div = num1 / num2;
		double mult = num1 * num2;
		double resto = num1 % num2;
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: "+ sub);
		System.out.println("Divisão: " + div);
		System.out.println("Multiplicação: " + mult);
		System.out.println("Resto: " + resto);
		
		System.out.println("\n");
		
		// Entrada de dados
		Scanner scanner =  new Scanner(System.in);
		System.out.print("Qual seu nome? ");
		String nome1 = scanner.nextLine();
		System.out.print("Olá " + nome1 + "!");
		
		System.out.println("\n");
		
		// Soma de dois números
		int numero1;
		int numero2;
		System.out.print("Informe um número: ");
		numero1 = scanner.nextInt();
		System.out.print("Informe outro número: ");
		numero2 = scanner.nextInt();
		int soma1 = numero1 + numero2;
		System.out.print("O resultado é: " + soma1);
		
		System.out.println("\n");
		
		/* Peça o ano de nascimento do usuário e mostre quantos anos ele tem*/
		int nascimento;
		int ano = 2025;
		System.out.print("Qual ano você nasceu? ");
		nascimento = scanner.nextInt();
		int total = ano - nascimento;
		System.out.print("Sua idade é: " + total + " anos.");
		
		System.out.println("\n");
		
		//Calcular desconto
		double preco;
		double desconto;
		System.out.print("Qual o valor da compra? ");
		preco = scanner.nextDouble();
		System.out.print("Qual o valor do desconto? ");
		desconto = scanner.nextDouble();
		double pagar = preco - desconto;
		System.out.print("Pague: " + pagar);
		
		System.out.println("\n");
		
		// Peça duas notas decimais para o usuário, calcule  média e mostre
		double decimal;
		double decimal2;
		System.out.print("Informe uma nota: ");
		decimal = scanner.nextDouble();
		System.out.print("Informe a segunda nota: ");
		decimal2 = scanner.nextDouble();
		double media = decimal + decimal2;
		double notafinal = media / 2;
		System.out.print("Sua média é: " + notafinal);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
