package primeiroProjeto;

import java.util.Scanner;

public class Lista4 {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		//1 - Verificar maioridade
		int idade;
		System.out.print("Qual a sua idade? ");
		idade = scanner.nextInt();
		if(idade >= 18) {
			System.out.println("Você tem "+ idade +" anos e é maior de idade.");
		} else {
			System.out.println("Você tem "+ idade +" anos e é menor de idade.");
		}
		
		System.out.println("\n");
		
		//2 - Comparar dois números
		double num1, num2;
		System.out.print("Digite um número: ");
		num1 = scanner.nextDouble();
		System.out.print("Digite outro número: ");
		num2 = scanner.nextDouble();
		if( num1>num2 ) {
			System.out.println("O primeiro número é maior.");
		} else {
			System.out.println("O segundo número é maior ou eles são iguais.");
		}
		
		System.out.println("\n");
		
		//3 - Aprovação por nota
		double nota;
		System.out.print("Insira a sua nota aqui: ");
		nota = scanner.nextDouble();
		if(nota>7) {
			System.out.println("Aprovado: sua nota foi "+ nota);
		} else {
			System.out.println("Reprovado: sua nota foi "+ nota);
		}
		
		System.out.println("\n");
		
		//4 - Verificar número positivo
		int num;
		System.out.print("Informe um número: ");
		num = scanner.nextInt();
		if(num>0) {
			System.out.println("O número é positivo.");
		} else {
			System.out.println("O número é negativo ou zero");
		}
		
		System.out.println("\n");
		
		//5 - Cálculo de frete
		double km, km1;
		System.out.print("Informe a distância de entrega em km: ");
		km = scanner.nextDouble();
		double menor = km*10;
		double maior = km*0.5;
		if(km<=50) {
			System.out.println("Valor do frete: R$"+menor);
		} else {
			System.out.println("Valor do frete: R$"+maior);
		}
		
		System.out.println("\n");
		
		//6 - O Número é 10?
		int num10;
		System.out.print("Informe um valor: ");
		num10 = scanner.nextInt();
		if(num10==10) {
			System.out.println("O número é 10.");
		} else {
			System.out.println("O número não é 10.");
		}
		
		System.out.println("\n");
		
		//7 - Desconto para Associados
		String desc;
		System.out.print("Você é associado?: ");
		desc = scanner.next();
		if(desc == "s") {
			System.out.println("Você tem desconto.");
		} else {
			System.out.println("Você não tem desconto.");
		}
		
		System.out.println("\n");
		
		//8 - Cálculo de bônus por horas extras
		int horat;
		System.out.println("Insira o número de horas trabalhadas: ");
		horat = scanner.nextInt();
		double menos = horat*20;
		double mais = horat*15;
		if(horat<10) {
			System.out.println("Bônus por hora extra R$"+menos);
		} else {
			System.out.println("Sem bônus por hora extra R$"+mais);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
