package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetMethods {
	public static void main(String[] args) {
		//INSTANCIANDO O OBJETO
		System.out.println("\nCrie um consjunto e adicione as notas: ");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println(notas.toString());

		//ADICIONANDO NA ARRAY
		System.out.println("\nConfira se a nota 5.0 está no conjunto: " + notas.contains(5d));

		System.out.println("\nExiba a menor nota: " + Collections.min(notas));
		System.out.println("Exiba a menor nota: " + Collections.max(notas));

		System.out.println("\nExiba a soma dos valores: " + Collections.min(notas));
	}
}
