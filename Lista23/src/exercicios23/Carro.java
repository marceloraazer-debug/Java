package exercicios23;

public class Carro {
	private String modelo;
	private int ano;
	private int velocidadeAtual = 0;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	
	public void acelerar(int valor) {
		if(valor > 0) {
			velocidadeAtual += valor;
		} else {
			System.out.println("Valor inválido para aceleração.");
		}
	}
	
	public void frear(int valor) {
		if(valor > 0) {
			velocidadeAtual -= valor;
			if(velocidadeAtual < 0) {
				velocidadeAtual = 0;
			}
		} else {
			System.out.println("Valor inválido para frenagem.");
		}
	}
}

