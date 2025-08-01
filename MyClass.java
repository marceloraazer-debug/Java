public class MyClass {
  public static void main(String args[]) {
      
    // Variáveis
    int idade = 24; // Números inteiros
    double salario = 1.75; // Números reais
    char letra = 'M'; // Letra ou Símbolo
    boolean estudante = true; // Verdadeiro ou Falso / True or False
    String nome = "Marcelo"; // Texto
    
    System.out.println("Minha idade é " + idade);
    System.out.println("Meu salário é " + salario);
    System.out.println("Minha inicial é " + letra);
    System.out.println("Estuda? " + estudante);
    System.out.println("Meu nome é " + nome);
    
    // Operadores Aritméticos
    int num1 = 5;
    int num2 = 3;
    int soma = num1 + num2;
    int sub = num1 - num2;
    int mult = num1 * num2;
    double div = num1 / num2;
    
    System.out.println("Soma " + soma);
    System.out.println("Subtração " + sub);
    System.out.println("Multiplicação " + mult);
    System.out.println("Divisão " + div);
    
    /* Cálculo da área de um Retângulo*/
    /* Largura * Comprimento*/
    double largura = 7.5;
    double comprimento = 3.0;
    double area = largura * comprimento;
    System.out.println("Área: " + area);
    
    // Cálculo do desconto
    double valor = 100;
    double desconto = 15; //15%
    double valorDesc = valor * (desconto / 100);
    double valorFinal = valor - valorDesc;
    System.out.println("A pagar " + valorFinal);
    
    
    
    
    
    
    
    
    
    
    
  }
}