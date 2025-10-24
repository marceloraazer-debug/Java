import java.util.Scanner;

public class MusicaP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Musica music = new Musica();
		
		music.titulo = "Aloha";
		music.artista = "Lana";
		music.duracao = 4;
		
		music.tocar();
		music.pausar();
		music.mostrarDetalhes();
		
		System.out.println("\n"+"------------"+"\n");
		
		music.titulo = "DiaBom";
		music.artista = "Lara";
		music.duracao = 6;
		
		music.tocar();
		music.pausar();
		music.mostrarDetalhes();
		
		System.out.println("\n"+"------------"+"\n");
		
		System.out.println("Titulo da musica: ");
		music.titulo = scanner.next();
		System.out.println("Nome da artista: ");
		music.artista = scanner.next();
		System.out.println("Duração da música: ");
		music.duracao = scanner.nextInt();
		music.tocar();
		music.pausar();
		music.mostrarDetalhes();
		
		

	}

}
