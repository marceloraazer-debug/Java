package exercicios23;

import java.util.Scanner;

public class AlunoP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Nome do aluno: ");
		String nome = scanner.next();
		System.out.println("Idade do aluno: ");
		int idade = scanner.nextInt();
		
		aluno.setNome(nome);
		aluno.setIdade(idade);
		
		System.out.println("____________________");
		System.out.println("Nome: "+aluno.getNome());
		System.out.println("Idade: "+aluno.getIdade());

	}

}
