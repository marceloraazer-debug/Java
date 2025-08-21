package primeiroProjeto;

import java.util.Scanner;

public class Lista5 {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		//1 - Classificação de idade
		int id1;
		System.out.print("Quantos anos você tem? ");
		id1 = scanner.nextInt();
		if(id1<=12) {
			System.out.print("Criança");
		} else if (id1<=17){
			System.out.print("Adolescente");
		} else if (id1<=59) {
			System.out.print("Adulto");
		} else if (id1>=60) {
			System.out.print("Idoso");
		} 
		
		System.out.println("\n\n");
		
		//2 - Avaliação de Temperatura
		int temp1;
		System.out.print("Informe a temperatura em graus celsius: ");
		temp1 = scanner.nextInt();
		if(temp1<10) {
			System.out.print("Muito Frio");
		} else if (temp1<20){
			System.out.print("Frio");
		} else if (temp1<30) {
			System.out.print("Agradável");
		} else if (temp1>30) {
			System.out.print("Muito Quente");
		} 
		
		System.out.println("\n\n");
		
		//3 - Sistema de Notas Escolares
		int nota1;
		System.out.print("Informe a sua nota: ");
		nota1 = scanner.nextInt();
		if(nota1>=90) {
			System.out.print("A");
		} else if (nota1>=80){
			System.out.print("B");
		} else if (nota1>=70) {
			System.out.print("C");
		} else if (nota1>=60) {
			System.out.print("D");
		} else if (nota1<60) {
			System.out.print("F");
		}
		
		System.out.println("\n\n");
		
		//4 - Verificação de senha
		String senha;
		System.out.println("Insira a senha: ");
		senha = scanner.next();
		if (senha.equals("admin")) {
			System.out.println("Acesso permitido!");
		} else {
			System.out.println("Acesso negado!");
		}
		
		System.out.println("\n\n");
		
		//5 - Comparação de nomes
		String nome1, nome2;
		System.out.println("Informe um nome: ");
		nome1 = scanner.next();
		System.out.println("Informe outro nome: ");
		nome2 = scanner.next();
		if (nome1.equalsIgnoreCase(nome2)) {
			System.out.println("Os nomes são iguais!");
		} else {
			System.out.println("Os nomes são diferentes.");
		}
		
		System.out.println("\n\n");
		
		//6 - Jogo da cor favorita
		String cores;
		System.out.println("Informe sua cor favorita: ");
		cores = scanner.next();
		if (cores.equalsIgnoreCase("azul")) {
			System.out.println("Boa escolha!");
		} else if (cores.equalsIgnoreCase("vermelho")) {
			System.out.println("Cor vibrante!");
		} else if (cores.equalsIgnoreCase("verde")) {
			System.out.println("Cor da natureza!");
		} else {
			System.out.println("Cor não cadastrada");
		}
		
		System.out.println("\n\n");
		
		//7 - Verificação de vogal
		String vogal;
		System.out.println("Digite uma letra: ");
		vogal = scanner.next();
		if (vogal.equalsIgnoreCase("a")) {
			System.out.println("É uma vogal.");
		} else if (vogal.equalsIgnoreCase("e")) {
			System.out.println("É uma vogal.");
		} else if (vogal.equalsIgnoreCase("i")) {
			System.out.println("É uma vogal.");
		} else if (vogal.equalsIgnoreCase("o")) {
			System.out.println("É uma vogal.");
		} else if (vogal.equalsIgnoreCase("u")) {
			System.out.println("É uma vogal.");
		} else {
			System.out.println("Não é vogal");
		}
		
		
		
		
		
		
		
		
	}

}
