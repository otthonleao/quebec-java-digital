package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * DADAS AS SEGUINTES INFORMAÇÕES SOBRE MINHAS SÉRIES FAVORITAS,
 * CRIE UM CONJUNTO E ORDENE ESTE CONJUNTO EXIBINDO:
 * (nome - genero - tempo de episodio);
 * 
 * serie 1 = nome: GOT, genero: fantasia, tempoEpisodio: 60
 * serie 2 = nome: Dark, genero: drama, tempoEpisodio: 60
 * serie 3 = nome: The Crown, genero: real life, tempoEpisodio: 25
 */

public class OrderingSet {
	public static void main(String[] args) {
		Set<Serie> minhaSerie = new HashSet<>() {{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("Dark", "drama", 60));
			add(new Serie("The Crown", "drama", 25));
		}};
		System.out.println("\n--\tOrdem Aleatoria\t--");
		for (Serie serie : minhaSerie) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}

		System.out.println("\n--\tOrdem de Inserção\t--");
		Set<Serie> minhaSerie1 = new LinkedHashSet<>() {{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("Dark", "drama", 60));
			add(new Serie("The Crown", "drama", 25));
		}};
		for (Serie serie : minhaSerie1) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}

	}
}

class Serie {

	private String nome;
	private String genero;
	private int tempoEpisodio;

	public Serie(String nome, String genero, int tempoEpisodio) {
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getTempoEpisodio() {
		return tempoEpisodio;
	}
	public void setTempoEpisodio(int tempoEpisodio) {
		this.tempoEpisodio = tempoEpisodio;
	}

	@Override
	public String toString() {
		return "Serie [nome = " + nome + ", genero = " + genero + ", tempoEpisodio = " + tempoEpisodio + "]";
	}
}
