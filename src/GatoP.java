import java.util.Scanner;

public class GatoP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Gato cat = new Gato();
		
		System.out.println("1 - Classe Gato"+"\n");
		
		cat.nome = "Bob";
		cat.idade = 10;
		cat.raca = "Siamês";
		
		cat.miar();
		cat.comer();
		cat.mostrarInformacoes();
		
		System.out.println("\n"+"------------"+"\n");
		
		System.out.println("Digite o nome do gato: ");
		cat.nome = scanner.next();
		System.out.println("Digite a idade do gato: ");
		cat.idade = scanner.nextInt();
		System.out.println("Digite a raça do gato: ");
		cat.raca = scanner.next();
		System.out.println("------------");
		cat.miar();
		cat.comer();
		cat.mostrarInformacoes();

	}

}
