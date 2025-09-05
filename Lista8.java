package primeiroProjeto;

import java.util.Scanner;

public class Lista8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Classificação de Dia da Semana
		System.out.println("Insira um número de 1 a 7 (1 = Domingo...): ");
		int dias = scanner.nextInt();

		switch (dias) {
		case 1:
			System.out.println("Fim de Semana");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Dias Úteis.");
			break;
		case 7:
			System.out.println("Fim de semana.");
			break;
		default:
			System.out.println("Dia inválido.");
			break;
		}

		System.out.println("\n" + "------" + "\n");

		// Menu de Bebidas
		System.out.println("Qual produto deseja? ");
		System.out.println("1 - Café");
		System.out.println("2 - Chá");
		System.out.println("3 - Suco");
		System.out.println("4 - Refrigerante");
		int escolha = scanner.nextInt();
		switch (escolha) {
		case 1:
			System.out.println("Pague R$5.00");
			break;
		case 2:
			System.out.println("Pague R$3.50");
			break;
		case 3:
			System.out.println("Pague R$4.00");
			break;
		case 4:
			System.out.println("Pague R$4.50");
			break;
		default:
			System.out.println("Código Inválido.");
		}

		System.out.println("\n" + "------" + "\n");

		// Tipo de Veículo
		System.out.println("Insira o código dos veículos para saber o peso: ");
		System.out.println("1 - Carro");
		System.out.println("2 - Moto");
		System.out.println("3 - Caminhão");
		int veiculo = scanner.nextInt();
		switch (veiculo) {
		case 1:
			System.out.println("Categoria: Leve");
			break;
		case 2:
			System.out.println("Categoria: Motocicleta");
			break;
		case 3:
			System.out.println("Categoria: Pesado");
			break;
		default:
			System.out.println("Veículo Inválido.");	
		}
		
		System.out.println("\n" + "------" + "\n");
		
		// Escolha de Plano de Assinatura
		System.out.println("Insira o código do plano para os benefícios: ");
		System.out.println("1 - Básico");
		System.out.println("2 - Intermediário");
		System.out.println("3 - Premium");
		int planos = scanner.nextInt();
		switch(planos) {
		case 1:
			System.out.println("Básico = Acesso Limitado.");
			break;
		case 2:
			System.out.println("Intermediário = Acesso padrão");
			break;
		case 3:
			System.out.println("Premium = Acesso total + suporte prioritário");
			break;
		default:
			System.out.println("Plano Inválido.");
		}
		
		System.out.println("\n" + "------" + "\n");
		
		// Seleção do Mês
		System.out.println("Insira um número entre 1 e 12, sendo (1 = Janeiro...): ");
		int estacao = scanner.nextInt();
		switch(estacao) {
		case 1:
		case 2:
			System.out.println("Verão");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Outono");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Inverno");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Primavera");
			break;
		case 12:
			System.out.println("Verão");
			break;
		default:
			System.out.println("Mês Inválido.");
		}
		
		System.out.println("\n" + "------" + "\n");
		
		// Tipo de Ingresso
		System.out.println("Escolha o código do ingresso e saiba o preço: ");
		System.out.println("1 - Inteira");
		System.out.println("2 - Meia-Entrada");
		System.out.println("3 - VIP");
		int ingressos = scanner.nextInt();
		switch(ingressos) {
		case 1:
			System.out.println("Inteira = R$50,00");
			break;
		case 2: 
			System.out.println("Meia-Entrada = R$25,00");
			break;
		case 3:
			System.out.println("VIP = R$100,00");
			break;
		default:
			System.out.println("Ingresso Inválido");
		}
		
		System.out.println("\n" + "------" + "\n");
		
		// Escolha de Idioma
		
		System.out.println("Informe um código de idioma: ");
		System.out.println("1 - Português");
		System.out.println("2 - Inglês");
		System.out.println("3 - Espanhol");
		int idioma = scanner.nextInt();
		switch(idioma) {
		case 1:
			System.out.println("Olá!");
			break;
		case 2:
			System.out.println("Hello!");
			break;
		case 3:
			System.out.println("Hola!");
			break;
		default:
			System.out.println("Idioma Inválido.");
		}
		
		System.out.println("\n" + "------" + "\n");
		
		// Nível de acesso
		System.out.println("Insira um código de nível para ver as permissões: ");
		System.out.println("1 - Usuário");
		System.out.println("2 - Moderador");
		System.out.println("3 - Administrador");
		int acesso = scanner.nextInt();
		switch(acesso) {
		case 1:
			System.out.println("Usuário = Acesso básico");
			break;
		case 2:
			System.out.println("Moderador = Acesso básico + edição");
			break;
		case 3:
			System.out.println("Administrador = Acesso total");
			break;
		default:
			System.out.println("Nível Inválido.");
		}
		
		System.out.println("\n" + "------" + "\n");
		
		// Tipo de pagamento
		System.out.println("Informe um código de pagamento para a confirmação: ");
		System.out.println("1 - Dinheirp");
		System.out.println("2 - Cartão de Crédito");
		System.out.println("3 - Pix");
		int pagamento = scanner.nextInt();
		switch(pagamento) {
		case 1:
			System.out.println("Dinheiro = Pagamento em dinheiro confirmado");
			break;
		case 2:
			System.out.println("Cartão de Crédito = Pagamento com cartão processado");
			break;
		case 3:
			System.out.println("Pix = Pagamento via Pix realizado");
			break;
		default:
			System.out.println("Metodo Inválido.");
		}
		
		
	

	}

}
