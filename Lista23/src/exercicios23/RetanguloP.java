package exercicios23;

import java.util.Scanner;

public class RetanguloP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Retangulo ret = new Retangulo();

		System.out.println("Digite a largura do retângulo: ");
		double largura = scanner.nextDouble();
		System.out.println("Digite a altura do retângulo: ");
		double altura = scanner.nextDouble();

		ret.setLargura(largura);
		ret.setAltura(altura);

		System.out.println("\n--- Dados do Retângulo ---");
		System.out.println("Largura: " + ret.getLargura());
		System.out.println("Altura: " + ret.getAltura());
		System.out.println("Área: " + ret.calcularArea());
		System.out.println("Perímetro: " + ret.calcularPerimetro());

	}

}
