package exercicios23;

import java.util.Scanner;

public class CarroP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Carro carro = new Carro();

		System.out.println("Digite o modelo do carro: ");
		String modelo = scanner.nextLine();
		System.out.println("Digite o ano do carro: ");
		int ano = scanner.nextInt();

		carro.setModelo(modelo);
		carro.setAno(ano);

		System.out.println("Acelerar quanto? ");
		int acelera = scanner.nextInt();
		carro.acelerar(acelera);

		System.out.println("Frear quanto? ");
		int freia = scanner.nextInt();
		carro.frear(freia);

		System.out.println("_________________");
		System.out.println("Modelo: " + carro.getModelo());
		System.out.println("Ano: " + carro.getAno());
		System.out.println("Velocidade Atual: " + carro.getVelocidadeAtual() + " km/h");

	}

}
