
public class Filme {
	String titulo;
	String genero;
	int duracao;
	
	void assistir() {
		System.out.println("Assistindo "+titulo);
	}
	void mostrarInformacoes() {
		System.out.println("Filme: "+ titulo);
		System.out.println("Gênero: "+ genero);
		System.out.println("Duração: "+ duracao+" horas");
	}
	
	
}
