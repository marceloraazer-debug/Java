package primeiroProjeto;

import java.util.Scanner;

public class Lista21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 1 
        System.out.println("Digite o primeiro número para somar: ");
        int soma1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int soma2 = scanner.nextInt();
        System.out.println("Soma: " + somar(soma1, soma2));
        System.out.println(linha());

        // 2 
        System.out.println("Digite o primeiro número para subtrair: ");
        int sub1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int sub2 = scanner.nextInt();
        System.out.println("Subtração: " + subtrair(sub1, sub2));
        System.out.println(linha());

        // 3 
        System.out.println("Digite o primeiro número para multiplicar: ");
        int mult1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int mult2 = scanner.nextInt();
        System.out.println("Multiplicação: " + multiplicar(mult1, mult2));
        System.out.println(linha());

        // 4 
        System.out.println("Digite o primeiro número para dividir: ");
        int div1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int div2 = scanner.nextInt();
        System.out.println(dividir(div1, div2));
        System.out.println(linha());

        // 5 
        System.out.println("Digite a primeira nota: ");
        double media1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double media2 = scanner.nextDouble();
        System.out.println("Média: " + calcularMedia(media1, media2));
        System.out.println(linha());

        // 6 
        System.out.println("Digite a primeira nota: ");
        double notaAprov1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double notaAprov2 = scanner.nextDouble();
        System.out.println("Resultado: " + verificarApr(notaAprov1, notaAprov2));
        System.out.println(linha());

        // 7 
        System.out.println("Digite o primeiro número: ");
        int maiorNum1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int maiorNum2 = scanner.nextInt();
        System.out.println(maiorNumero(maiorNum1, maiorNum2));
        System.out.println(linha());

        // 8 
        System.out.println("Digite a temperatura em Celsius: ");
        double tempCelsius = scanner.nextDouble();
        System.out.println("Temperatura em Fahrenheit: " + converter(tempCelsius));
        System.out.println(linha());

        // 9 
        System.out.println("Digite a base do retângulo: ");
        double baseRet = scanner.nextDouble();
        System.out.println("Digite a altura do retângulo: ");
        double alturaRet = scanner.nextDouble();
        System.out.println("Área: " + calcular(baseRet, alturaRet));
        System.out.println(linha());

        // 10 
        System.out.println("Digite seu nome: ");
        scanner.nextLine(); // limpar buffer
        String nomePessoa = scanner.nextLine();
        System.out.println(gerarMensagem(nomePessoa));
        System.out.println(linha());

        // 11 
        System.out.println("Digite o primeiro nome: ");
        String nomePrimeiro = scanner.nextLine();
        System.out.println("Digite o segundo nome: ");
        String nomeSegundo = scanner.nextLine();
        System.out.println("Resultado: " + juntarNomes(nomePrimeiro, nomeSegundo));
        System.out.println(linha());

        // 12 
        System.out.println("Digite sua idade: ");
        int idadePessoa = scanner.nextInt();
        System.out.println("Classificação: " + avaliarIdade(idadePessoa));
        System.out.println(linha());

    }

    public static String linha() {
        return "---=-=-=-=-=-=-=-=-=-=-=-=-=---";
    }
    
    // 1 
    public static int somar(int soma1, int soma2) {
        return soma1 + soma2;
    }
    
    // 2
    public static int subtrair(int sub1, int sub2) {
        return sub1 - sub2;
    }
    
    // 3
    public static int multiplicar(int mult1, int mult2) {
        return mult1 * mult2;
    }
    
    // 4
    public static String dividir(int div1, int div2) {
        if (div2 == 0) {
            return "Não é possível dividir por 0";
        } else {
            return "Resultado: " + (div1 / div2);
        }
    }
    
    // 5
    public static double calcularMedia(double media1, double media2) {
        return (media1 + media2) / 2;
    }
    
    // 6
    public static String verificarApr(double notaAprov1, double notaAprov2) {
        double media = calcularMedia(notaAprov1, notaAprov2);
        if (media >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    // 7
    public static String maiorNumero(int maiorNum1, int maiorNum2) {
        if (maiorNum1 > maiorNum2) {
            return "Maior número: " + maiorNum1;
        } else if (maiorNum2 > maiorNum1) {
            return "Maior número: " + maiorNum2;
        } else {
            return "Eles são iguais";
        }
    }
    
    // 8
    public static double converter(double tempCelsius) {
        return (tempCelsius * 9 / 5) + 32;
    }

    // 9
    public static double calcular(double baseRet, double alturaRet) {
        return baseRet * alturaRet;
    }

    // 10
    public static String gerarMensagem(String nomePessoa) {
        return "Olá, " + nomePessoa + "!";
    }
    
    // 11
    public static String juntarNomes(String nomePrimeiro, String nomeSegundo) {
        return nomePrimeiro + " " + nomeSegundo;
    }

    // 12
    public static String avaliarIdade(int idadePessoa) {
        if (idadePessoa < 12) {
            return "Criança";
        } else if (idadePessoa < 18) {
            return "Adolescente";
        } else if (idadePessoa < 60) {
            return "Adulto";
        } else {
            return "Idoso";
        }
    }
}