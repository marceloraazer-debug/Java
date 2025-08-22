package primeiroProjeto;

import java.util.Scanner;

public class Lista6 {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		// Intervalo numérico
		System.out.print("Insira um número: ");
		int num1 = scanner.nextInt();
		
		if(num1 > 10 && num1 < 20) {
			System.out.println("Número dentro do intervalo");
		} else {
			System.out.println("Fora do intervalo");
		}
		
		System.out.println("\n");
		System.out.println("------------------------");
		
		// Acesso à festa
		System.out.print("Qual a sua idade? ");
		int idade = scanner.nextInt();
		System.out.print("Você possui convite? (true/false) ");
		boolean convite = scanner.nextBoolean();
		
		if(idade >= 18 && convite) {
			System.out.println("Entrada permitida");
		} else {
			System.out.println("Entrada não permitida");
		}
		
		System.out.println("\n");
		System.out.println("------------------------");
		
		// Categoria de esporte
		System.out.print("Informe sua idade: ");
		int idade1 = scanner.nextInt();
		
		if(idade1 < 12 || idade1 > 60) {
			System.out.println("Categoria especial");
		} else {
			System.out.println("Categoria normal");
		}
		
		System.out.println("\n");
		System.out.println("------------------------");
		
		// Desconto no produto
		System.out.print("Informe o valor do produto: ");
		double valor = scanner.nextDouble();
		System.out.print("Informe a forma de pagamento: ");
		String pagamento = scanner.next();
		
		if (valor>100 && pagamento.equalsIgnoreCase("avista")) {
			System.out.println("Você ganhou 10% de desconto.");
		} else {
			System.out.println("Valor sem desconto.");
		}
		
		System.out.println("\n");
		System.out.println("------------------------");
		
		// Triagem médica
		System.out.print("Insira sua temperatura: ");
		int temp = scanner.nextInt();
		System.out.print("Você está tendo sintomas? (true/false) ");
		boolean sintoma = scanner.nextBoolean();
		
		if (temp>=38 || sintoma) {
			System.out.println("Recomenda-se um médico.");
		} else {
			System.out.println("Sem sinais preocupantes.");
		}
		
		System.out.println("\n");
		System.out.println("------------------------");
		
		// Votação
		System.out.print("Insira sua idade: ");
		int idade2 = scanner.nextInt();
		System.out.print("Você é brasileiro? (true/false) ");
		boolean brasile = scanner.nextBoolean();
		
		if(idade2>=16 && brasile) {
			System.out.println("Pode votar!");
		} else {
			System.out.println("Não pode votar!");
		}
		
		System.out.println("\n");
		System.out.println("------------------------");
		
		// Bônus de funcionário
		System.out.print("Informe a quantidade de horas extras: ");
		int extra = scanner.nextInt();
		System.out.print("Informe o número de faltas: ");
		int falta = scanner.nextInt();
		
		if (extra>20 && falta<5) {
			System.out.println("Você ganhou bônus!");
		} else {
			System.out.println("Você não recebeu bônus.");
		}
		
		System.out.println("\n");
		System.out.println("------------------------");
		
		// Autorização para dirigir 
		System.out.print("Informe sua idade: ");
		int idade3 = scanner.nextInt();
		System.out.print("Possui carteira de motorista? (true/false): ");
		boolean motorista = scanner.nextBoolean();
		
		if (idade3>=18 && motorista) {
			System.out.println("Pode dirigir!");
		} else {
			System.out.println("Não pode dirigir.");
		}
		
		System.out.println("\n");
		System.out.println("------------------------");
		
		// Elegibilidade para Bolsa de Estudos
		System.out.print("Informe sua nota média (0 a 10): ");
		int nota1 = scanner.nextInt();
		System.out.print("Informe sua frequência (0 a 100): ");
		int freq = scanner.nextInt();
		
		if(nota1>=8 && freq>=80) {
			System.out.println("Bolsa concedida");
		} else {
			System.out.println("Bolsa não concedida");
		}
		
		System.out.println("\n");
		System.out.println("------------------------");
		
		// Verificação de Temperatura Ambiente
		System.out.print("Informe a temperatura atual sem °C: ");
		int temp3 = scanner.nextInt();
		System.out.print("Informe a umidade sem %: ");
		int umidade = scanner.nextInt();
		
		if(temp3<18 || temp3>26 && umidade>60) {
			System.out.println("Ajustar climatização");
		} else {
			System.out.println("Climatização não necessária.");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
