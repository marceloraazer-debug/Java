package InstrumentosMusicais;

import java.util.Scanner;

public class MainInstrumento {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um instrumento:");
        System.out.println("1 - Violão");
        System.out.println("2 - Bateria");
        System.out.println("3 - Piano");
        System.out.print("Opção: ");

        int opcao = scanner.nextInt();

        Instrumento inst;

        if (opcao == 1) {
            inst = new Violao();
        } else if (opcao == 2) {
            inst = new Bateria();
        } else if (opcao == 3) {
            inst = new Piano();
        } else {
            System.out.println("Opção inválida!");
            return;
        }

        inst.tocar();

    }

}
