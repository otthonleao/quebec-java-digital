package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/** 
 * Dadas as seguintes informações sobre meus livros favoritos e seus autores, crie um dicionário e ordene este dicionário:
 * exibindo (Nome Autor - Nome Livro);
 * Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
 * Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
 * Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/ 

public class OrderingMap {
	public static void main(String[] args) {
		System.out.println("\n1 --\tOrdem Aleatória\t--");
		Map<String, Livro> meusLivros = new HashMap<>() {{
			put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
		}};
		//Para trabalhar com os elementos da array separadamente usamos o entrySet()
		for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}

		//Ordem de inserção é sempre LinkedHashMap<>()
		System.out.println("\n2 --\tOrdem de Inserção\t--");
		Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
			put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
			put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
			put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
		}};
		for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

		System.out.println("\n3 --\tOrdem alfabética autores\t--");
		Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
		for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

		System.out.println("\n4 --\tOrdem alfabética nomes dos livros\t--");

		Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
		meusLivros3.addAll(meusLivros.entrySet());
		for (Map.Entry<String, Livro> livro : meusLivros3)
		System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
	}
}

class Livro {
	private String nome;
	private Integer paginas;
	
	public Livro(String nome, Integer paginas) {
		this.nome = nome;
		this.paginas = paginas;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPaginas() {
		return paginas;
	}
	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (paginas == null) {
			if (other.paginas != null)
				return false;
		} else if (!paginas.equals(other.paginas))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[nome = " + nome + ", paginas = " + paginas + "]";
	}
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

	@Override
	public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
		return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
	}
}