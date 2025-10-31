package exercicios23;

import java.util.Scanner;

public class ContaBancariaP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ContaBancaria cb = new ContaBancaria();
		
		System.out.println("Nome da titular: ");
		String nome = scanner.next();
		System.out.println("Despósito: ");
		double dep = scanner.nextDouble();
		System.out.println("Sacar: ");
		double sacar = scanner.nextDouble();

		cb.setTitular(nome);
		cb.depositar(dep);
		cb.sacar(sacar);
		
		System.out.println("Titular: "+cb.getTitular());
		System.out.println("Saldo Final: "+cb.getSaldo());

	}

}
