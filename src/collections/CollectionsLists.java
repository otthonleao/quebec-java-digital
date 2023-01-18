package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsLists {
	public static void main(String[] args) {
		//Os valores da array pode ser passado direto nos parentreses quando for instanciar o objeto igual como é feito quando temos um construtor
		ArrayList<Double> notas = new ArrayList<Double>();
		notas.add(7.0); //Pode ser 7d já que definimos como Double
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		System.out.println("ArrayList: " + notas + "\n");

		System.out.println("1 - Exiba a posição da nota 5.0: " + notas.indexOf(5d) + "\n");
		
		System.out.println("2 - Adicione na Array a nota 8.0 na posição[4]: 'notas.add(index, elemento);'");
		notas.add(4, 8d);
		System.out.println(notas + "\n");

		System.out.println("3 - Substitua a nota 5.0 pela nota 6.0: 'notas.set(notas.indexOf(5d), 6.0);'");
		notas.set(notas.indexOf(5d), 6.0); //Como não sabemos em qual index está a nota 5.0, primeiro temos que usa o indexOf no lugar do elemento a ser substiruído
		System.out.println(notas + "\n");

		System.out.println("4 - Confira se a nota 5.0 está na lista: " + notas.contains(5d)); //Retorna um boolean
		System.out.println(notas + "\n");

		//EXIBIR POR INDEX
		System.out.println("5 - Exiba todas as notas na ordem em que foram informadas:");
		for (Double nota : notas)
			System.out.println(nota);
		
		System.out.println("6 - Exiba a terceira nota adicionada: " + notas.get(2));
		System.out.println(notas.toString() + "\n");

		System.out.println("7 - Exiba a menor nota: " + Collections.min(notas));

		System.out.println("8 - Exiba a maior nota: " + Collections.max(notas));

		
		//CALCULO DE VALORES
		//O iterator vai percorrer pela array sempre "perguntando" se tem algum elemento no próximo index. Enquanto não tiver mais nenhum valor no index seguinte ele não para. Por isso chama-se '.hasNext'
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("\n9 - Exiba a soma dos valores: " + soma);

		//Para saber a quantidade de elementos da List '.size()'
		System.out.println("10 - Exiba a média dos valores: " + soma/notas.size() + "\n");

		//REMOÇÃO
		//Pode-se passar como argumento tanto quanto a posição ou o valor do objeto/elemento
		System.out.println("Lista Atual: "+ notas);

		System.out.println("11 - Remova a nota 0: " + notas.remove(0d));
		System.out.println(notas + "\n");

		System.out.println("12 - Remova a nota na posição 0: " + notas.remove(0));
		System.out.println(notas + "\n");

		System.out.println("13 - Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator2 = notas.iterator();
		while (iterator2.hasNext()) {
			Double next = iterator2.next();
			if (next < 7)
				iterator2.remove();
		}
		System.out.println(notas + "\n");

		//Apagar todos os elementos da lista
		System.out.println("14 - Apague toda a a lista: ");
		notas.clear();
		System.out.println(notas + "\n");

		System.out.println("15 - A lista está vazia? " + notas.isEmpty());

	}
}
