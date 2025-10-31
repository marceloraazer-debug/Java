package exercicios23;

import java.util.Scanner;

public class AvaliacaoP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Avaliacao ava = new Avaliacao();
		
		System.out.println("Informe seu nome: ");
		String nome = scanner.next();
		System.out.println("Nota 1: ");
		int nota1 = scanner.nextInt();
		System.out.println("Nota 2: ");
		int nota2 = scanner.nextInt();
		
		ava.setNota1(nota1);
		ava.setNota2(nota2);
		ava.setNome(nome);
		
		System.out.println("Nome: "+ava.getNome());
		System.out.println("Nota 1: "+ava.getNota1());
		System.out.println("Nota 2: "+ava.getNota2());
		System.out.println("Média: "+ava.calcularMedia());

	}

}
