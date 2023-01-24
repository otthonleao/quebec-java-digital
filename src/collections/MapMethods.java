package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * DADO OS MODELOS DOS CARROS E SEUS RESPECTIVOS CONSUMOS NA ESTRADA, FAÇA:
 * modelo: gol - consumo: 14.4
 * modelo: uno - consumo: 15.6
 * modelo: mobi - consumo: 16.1
 * modelo: hb20 - consumo: 14.5
 * modelo: kwid - consumo: 15.6
 */

public class MapMethods {
	public static void main(String[] args) {
		System.out.println("\n1 - Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
		//No Map temos que declarar o tipo da chave e do valor
		Map<String, Double> carrosPopulares = new HashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 15.5);
			put("kwid", 15.6);
		}};
		System.out.println(carrosPopulares.toString());

		System.out.println("\n2 - Substitua o consumo do gol por 15.2 km/l: 'carrosPopulares.put(\"gol\", 15.2)'");
		System.out.println("Before: " + carrosPopulares);
		carrosPopulares.put("gol", 15.2);
		System.out.println("after: " + carrosPopulares);

		System.out.println("\n3 - Confira se o modelo tucson está no dicionário: 'carrosPopulares.containsKey(\"tucson\")'");
		System.out.println(carrosPopulares.containsKey("tucson"));
		
		System.out.println("\n4 - Exiba o consumo do Uno: 'carrosPopulares.get(\"uno\")'");
		System.out.println(carrosPopulares.get("uno"));

		System.out.println("\n5 - Exiba os modelos: 'carrosPopulares.keySet()' ");
		System.out.println(carrosPopulares.keySet());

		System.out.println("\n6 - Exiba os consumos dos carros: 'carrosPopulares.values()' ");
		System.out.println(carrosPopulares.values());

		System.out.println("\n7 - Exiba o modelo mais econômico e o seu consumo: ");
		Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		String modeloMaisEficiente = "";
		for (Map.Entry<String,Double> entry : entries) {
			if (entry.getValue().equals(consumoMaisEficiente)) {
				modeloMaisEficiente = entry.getKey();
				System.out.println("Modelo: " + modeloMaisEficiente + " - Consumo: " + consumoMaisEficiente);
			}
		}

		System.out.println("\n8 - Exiba o modelo menos econômico e o seu consumo: ");
		Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
		String modeloMenosEficiente = "";
		for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
			if (entry.getValue().equals(consumoMenosEficiente)) {
				modeloMenosEficiente = entry.getKey();
				System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - Consumo: " + consumoMenosEficiente);
			}
		}

		System.out.println("\n9 - Exiba a soma do consumo: ");
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println(soma);

		System.out.println("\n10 - Exiba a média do consumo: ");
		System.out.println(soma / carrosPopulares.size());

		System.out.println("\n11 - Remova os modelos com o consumo igual a 15,6 km/l: ");
		System.out.println("Before: " + carrosPopulares);
		Iterator<Double> iterator1 = carrosPopulares.values().iterator();
		while(iterator1.hasNext()) {
			if(iterator1.next().equals(15.6)) {
				iterator1.remove();
			}
		}
		System.out.println("After: " + carrosPopulares);

		System.out.println("\n12 - Exiba todos os carros na ordem que foram informados: ");
		Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		System.out.println(carrosPopulares1.toString());

		System.out.println("\n13 - Exiba todos os carros na ordem que foram informados: ");
		Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
		System.out.println(carrosPopulares2.toString());

		System.out.println("\n14 - Apague o dicionário de carros: 'carrosPopulares.clear()' ");
		carrosPopulares.clear();

		System.out.println("\n15 - Confira se o dicionário está vazio: 'carrosPopulares.isEmpty()'");
		carrosPopulares.isEmpty();
	}
}
