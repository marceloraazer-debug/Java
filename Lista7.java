package primeiroProjeto;

import java.util.Scanner;

public class Lista7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 1
		System.out.print("Qual a sua idade? ");
		int id1 = scanner.nextInt();
		
		if (id1 < 16 || id1 > 70) {
			System.out.println("Classificação especial");
		} else {
			System.out.println("Classificação regular");
		}
		
		System.out.println("\n" + "------" + "\n");
		
		// 2
		System.out.print("Digite o valor do produto: R$ ");
        double valor = scanner.nextDouble();
        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();
        double total = valor * quantidade;
        
        if (total > 200 && quantidade > 5) {
            double desconto = total * 0.15;
            double valorFinal = total - desconto;
            System.out.println("Desconto de 15% aplicado!");
            System.out.println("Valor a pagar: "+ valorFinal);
        } else {
        	System.out.println("Você pegará: "+ total);
        }
		
		System.out.println("\n" + "------" + "\n");
		
		// 3 
		System.out.print("Insira sua frequência cardíaca. BPM: ");
		int bpm = scanner.nextInt();
		System.out.print("Você está sentindo tontura? ");
		String tontura = scanner.next();
		
		if(bpm>=100 || tontura.equalsIgnoreCase("Sim")) {
			System.out.println("Procure atendimento médico");
		} else {
			System.out.println("Sem sinais de alerta.");
		}
		
		System.out.println("\n" + "------" + "\n");
		
		//4 
		System.out.print("Qual sua idade? ");
		int idade1 = scanner.nextInt();
		System.out.print("Você é residente do estado? ");
		String residente = scanner.next();
		
		if(idade1 > 18 && idade1 < 30 && residente.equalsIgnoreCase("Sim")) {
			System.out.println("Elegível para o concurso");
		} else {
			System.out.println("Não elegível para o concurso");
		}
		
		System.out.println("\n" + "------" + "\n");
		
		//5 
		System.out.println("Insira o número de projetos concluídos: ");
		int projetos = scanner.nextInt();
		System.out.println("Insira o número de erros reportados: ");
		int erros = scanner.nextInt();
		
		if(projetos > 10 && erros < 3) {
			System.out.println("Recompensa concedida");
		} else {
			System.out.println("Sem recompensa");
		}
		
		System.out.println("\n" + "------" + "\n");
		
		//6
		System.out.print("Informe a sua idade: ");
		int idade2 = scanner.nextInt();
		System.out.print("Possui passaporte válido? ");
		String passap = scanner.next();
		
		if(idade2 >= 18 && passap.equalsIgnoreCase("Sim")) {
			System.out.println("Viagem autorizada");
		} else {
			System.out.println("Viagem não autorizada");
		}
		
		System.out.println("\n" + "------" + "\n");
		
		//7 
		System.out.print("Informe a nota final (0 a 100): ");
		int nota = scanner.nextInt();
		System.out.print("Informe as aulas assistidas (0 a 50): ");
		int aulas = scanner.nextInt();
		
		if(nota >= 70 && aulas>=40) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		System.out.println("\n" + "------" + "\n");
		
		//8 
		System.out.print("Informe a umidade do solo: ");
		int umidade = scanner.nextInt();
		System.out.print("Informe a temperatura: ");
		int tempera = scanner.nextInt();
		
		if(umidade < 30 || tempera > 30) {
			System.out.println("Irrigação necessária");
		} else {
			System.out.println("Irrigação não necessária");
		}
		
		System.out.println("\n" + "------" + "\n");
		
		//9 
		System.out.println("Qual sua idade? ");
		int idade3 = scanner.nextInt();
		System.out.println("Possui experiência prévia? ");
		String previa = scanner.next();
		
		if(idade3 >= 20 && idade3 <= 40 && previa.equalsIgnoreCase("Sim")) {
			System.out.println("Inscrição aceita");
		} else {
			System.out.println("Inscrição não permitida");
		}
		
		
		
		
		
	}

}
