/*
 * Tienes que  hacer  lo  mismo  que en el  punto  anterior,  
 * pero devolviendo  una lista que  incluya los elementos con más  de 5  letras . Imprime  el  eje de resultados .   
 */
package n1fase1d;
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
		
		System.out.println("Lista con los nombres que contienen la letra o y 5 o mas letras: "+buscaNombresConO(names));
	}
	
	public static List<String> buscaNombresConO(ArrayList <String> names) {
		return  names.stream()
				.filter(n -> n.contains("o") || n.contains("O") && n.length() >= 5)
				.collect(Collectors.toList());
	}
}
