package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Ordenação de elementos em uma List Collections
/**
 * DADOS AS SEGUINTES INFORMAÇÕES SOBRE MEUS GATOS,
 * CRIE UMA LISTA E ORDENE ESTA LISTA EXIBINDO:
 * (nome - idade - cor);
 * 
 * Gato 1 = nome: Jon, idade: 18, cor: preto
 * Gato 2 = nome: Simba, idade: 6, cor: tigrado
 * Gato 3 = nome: Jon, idade: 12, cor: amarelo
 */

 //[1] Criar uma classe gato e depois criar uma lista do tipo gato

public class OrderingList {
	public static void main(String[] args) {
		//Criando a lista do tipo Cat
		List<Cat> myCats = new ArrayList<Cat>() {{
			add(new Cat("Jon", 18, "black"));
			add(new Cat("Simba", 6, "gray"));
			add(new Cat("Jon", 12, "yellow"));
			add(new Cat("Oliver", 28, "white"));
		}};

		System.out.println("\n---\tOrdem de Inserção\t---");
		System.out.println(myCats);

		System.out.println("\n---\tOrdem de Aleatória\t---");
		Collections.shuffle(myCats);
		System.out.println(myCats);
		
		System.out.println("\n---\tOrdem de Natural (NOME)\t---");
		//[2] É preciso ir na classe e implementar a interface Comparable
		Collections.sort(myCats);
		System.out.println(myCats);

		System.out.println("\n---\tOrdem por Idade\t---");
		//[3] É preciso criar uma nova classe para passar o parametro de comparação
		//[3.3] Já existe um método na list, e pode até reclamar, mas funciona nos dois casos.
		//[3.4] Option 1
		//Collections.sort(myCats, new ComparatorAge());
		//[3.5] Option 2
		myCats.sort(new ComparatorAge());
		System.out.println(myCats);

		System.out.println("\n---\tOrdem por Cor\t---");
		//[4] Mesmo esquema do que foi feito por idade, mas é preciso ficar atento ao tipo de saída do método para saber se vai precisar usar o "ToIgnoreCase"
		//[4.1] Option 1
		//Collections.sort(myCats, new ComparatorColor());
		//[4.2] Option 2
		myCats.sort(new ComparatorColor());
		System.out.println(myCats);

		System.out.println("\n---\tOrdem Nome - Cor - Idade\t---");
		//[5] Nesse caso vamos fazer primeiro a comparação por nome
		//[5.1] Se os nomes forem iguais, o critério de desempate vai ser a comparação por cor
		//[5.2] Se as cores forem iguais, o desempate vai ser por idade
		//[5.3] Criar uma nova classe com interface de comparação
		//[5.7] Option 1
		//Collections.sort(myCats, new ComparatorNomeCorIdade());
		//[5.8] Option 2
		myCats.sort(new ComparatorNomeCorIdade());
		System.out.println(myCats);

	}
}

class Cat implements Comparable<Cat> {
	private String name;
	private int age;
	private String color;

	//Constructor
	public Cat (String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	//É necessário sobreescrever com toString() senão quando usarmos o 'System.out.println()' no objeto instanciado a partir dess classe, vai ser impresso o endereço de memória e o que vamos querer imprimir será a array com os elementos adicionados
	@Override
	public String toString() {
		return "[name = " + name + ", age = " + age + ", color = " + color + "]";
	}

	//[2]ORDEM NATURAL
	/**
	 * Override implementado através do método equals(Object)
	 * Para comparar para depois ordenar por nome
	 * Devemos retornar o nome e ignorar o tipo do nome que é uma String pq  o método é int.
	 * Por debaixo dos panos se o nome que estamos comparando, com o próximo nome da lista, forem iguais, é como se tivesse retornando 0.
	 * Se der 1 é pq o nome que estamos comparando é maior.
	 * Se der -1 é pq o nome comparado é maior
	 * O ComparaBLE só pode usar uma vez, se precisar ordenar utilizando outrs elementos deve-se criar uma nova classe e implementar o ComparaTOR
	*/
	@Override
	public int compareTo(Cat cat) {
		return this.getName().compareToIgnoreCase(cat.getName());
	}
}

//[3]
class ComparatorAge implements Comparator<Cat> {
	//[3.1] Foi implementado a interface Comparator que irá comparar a classe Cat
	//[3.2] Com isso vai ser comparado e ordenado por idade.
	@Override
	public int compare(Cat c1, Cat c2) {
		return Integer.compare(c1.getAge(), c2.getAge());
	}
}

//[4]
class ComparatorColor implements Comparator<Cat> {

	@Override
	public int compare(Cat c1, Cat c2) {
		return c1.getColor().compareToIgnoreCase(c2.getColor());
	}
}

//[5]
class ComparatorNomeCorIdade implements Comparator<Cat> {
	@Override
	public int compare(Cat c1, Cat c2) {
		//[5.4] Se os nomes não forem iguais retorna nome
		int nome = c1.getName().compareToIgnoreCase(c2.getName());
		if (nome != 0) return nome;

		//[5.5] Se os nomes forem iguais vai chegar aqui e comparar as cores
		int cor = c1.getColor().compareToIgnoreCase(c2.getColor());
		if (cor != 0) return cor;

		//[5.6] Então só resta a comparação por idade pra desempatar
		return Integer.compare(c1.getAge(), c2.getAge());
	}

}
