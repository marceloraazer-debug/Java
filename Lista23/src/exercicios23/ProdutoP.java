package exercicios23;

import java.util.Scanner;

public class ProdutoP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Produto prod = new Produto();
		
		System.out.println("Nome do produto: ");
		String nome = scanner.next();
		System.out.println("Preço do produto: ");
		double preco = scanner.nextInt();
		System.out.println("Quantidade em estoque: ");
		int estoque = scanner.nextInt();
		
		prod.setNome(nome);
		prod.setPreco(preco);
		prod.setEstoque(estoque);
		
		System.out.println("____________________");
		System.out.println("Nome: "+prod.getNome());
		System.out.println("Preço: "+prod.getPreco());
		System.out.println("Estoque: "+prod.getEstoque());

	}
}
