/*
 * Teniendo una lista de Strings, 
 * escribe un m�todo que retorne una lista de todas las cadenas que contengan la letra �o� e imprime el resultado
 */
package n1fase1c;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[]args) {
		ArrayList <String> names = new ArrayList<String>();
		names.add("Pedro");
		names.add("Juan");
		names.add("Olga");
		names.add("Eva");
		names.add("Sandro");
		
		System.out.println("Lista con los nombres que contienen la letra o: "+buscaNombresConO(names));
	}
	
	public static List<String> buscaNombresConO(ArrayList <String> names) {
		return  names.stream()
				.filter(n -> n.contains("o") || n.contains("O"))
				.collect(Collectors.toList());
	}
}
