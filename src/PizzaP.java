import java.util.Scanner;

public class PizzaP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Pizza pizza = new Pizza();
		
		pizza.sabor = "Calabresa";
		pizza.tamanho = "Médio";
		pizza.bordaRecheada = true;
		pizza.mostrarInformacoes();
		
		System.out.println("\n"+"------------"+"\n");
		
		System.out.println("Qual sabor da pizza? ");
		pizza.sabor = scanner.next();
		System.out.println("Qual tamanho da pizza? ");
		pizza.tamanho = scanner.next();
		System.out.println("Borda com recheio? ");
		pizza.bordaRecheada = scanner.nextBoolean();
		System.out.println("------------");
		pizza.mostrarInformacoes();
		
		
		
		

		

	}

}
