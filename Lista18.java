package primeiroProjeto;

public class Lista18 {

	public static void main(String[] args) {
		nome();
		separador();
		frase();
		separador1();
		valores();
		separador2();
		vogais();
		separador3();
		quadrado();
		separador4();
		pares();
		separador5();
		contagem();
		separador6();
		triangulo();
		separador7();
		dias();
		separador8();

	}

	// 1
	public static void nome() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Marcelo");
		}
	}

	// separador
	public static void separador() {
		System.out.println("-----------------------------------");
	}

	// 2
	public static void frase() {
		System.out.println("Você é capaz.");
	}

	// separador
	public static void separador1() {
		System.out.println("-----------------------------------");
	}

	// 3
	public static void valores() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	// separador
	public static void separador2() {
		System.out.println("-----------------------------------");
	}

	// 4
	public static void vogais() {
		System.out.println("a");
		System.out.println("e");
		System.out.println("i");
		System.out.println("o");
		System.out.println("u");
	}

	// separador
	public static void separador3() {
		System.out.println("-----------------------------------");
	}

	// 5
	public static void quadrado() {
		for (int i = 0; i < 4; i++) {
			System.out.println("*   *   *");
		}
	}

	// separador
	public static void separador4() {
		System.out.println("-----------------------------------");
	}

	// 6
	public static void pares() {
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println("Os valores pares são: " + i);
			}
		}
	}

	// separador
	public static void separador5() {
		System.out.println("-----------------------------------");
	}

	// 7
	public static void contagem() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("FIM");
	}

	// separador
	public static void separador6() {
		System.out.println("-----------------------------------");
	}

	// 8
	public static void triangulo() {
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
	}
	

	// separador
	public static void separador7() {
		System.out.println("-----------------------------------");
	}

	// 9
	public static void dias() {
		System.out.println("Domingo");
		System.out.println("Segunda-Feira");
		System.out.println("Terça-Feira");
		System.out.println("Quarta-Feira");
		System.out.println("Quinta-Feira");
		System.out.println("Sexta-Feira");
		System.out.println("Sábado");
	}

	// separador
	public static void separador8() {
		System.out.println("-----------------------------------");
	}
	

}
