package collections;

/** 
 * Dadas as seguintes informações sobre meus livros favoritos e seus autores, crie um dicionário e ordene este dicionário:
 * exibindo (Nome Autor - Nome Livro);
 * Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
 * Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
 * Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/ 

public class OrderingMap {
	public static void main(String[] args) {
		
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
