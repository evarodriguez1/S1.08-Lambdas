/*
 * Haz una matriz que contenga algunas cadenas de texto y n�meros. Ord�nalos por: 
 * a) Longitud (de m�s corta a m�s larga).
 */
package n2todos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[]args) {
		
		List<String> mix = Arrays.asList("Hola","pedo","Pedro","Eva","3",
			"7","!","t","transporte","746","3va","Julen","Julieta");
		
		//a) Longitud (de m�s corta a m�s larga).
		List<String> lengthUp = mix.stream()
				.sorted(Comparator.comparing(l -> l.length())) //va comparando la long de las cadenas entre si y el sorted las ordena de menos a mayor
				.collect(Collectors.toList()); //las colecta en la nueva lista
		System.out.println("\n Mix ordered by length:\n " +lengthUp);
		
		//b) Longitud inversa (de m�s larga a m�s corta) 
		List<String> lengthDown = mix.stream()
				.sorted(Comparator.comparingInt(String::length).reversed())
				.collect(Collectors.toList());
		System.out.println("\n Mix ordered by reversed length:\n " +lengthDown);
		
		//c) Alfab�ticamente por el primer car�cter
		List<String> firstChar = mix.stream()
				.sorted(Comparator.comparingInt(i -> i.charAt(0))) //charAt (0) retorna el c�digo num�rico del primer car�cter
				.collect(Collectors.toList());
		System.out.println("\n Mix ordered by first character:\n " +firstChar);
		
		//d) Las cadenas que contienen "e" primero, todo el resto en segundo lugar 
		//(poned el c�digo directamente a la lambda).
		List<String> firstE = mix.stream()
				.sorted(Comparator.comparing(w -> w.length())) //ordena y compara por longitud de cadena
				.sorted(Comparator.comparing(w -> !w.contains("e"))) //ordena y compara por cadenas q contengan "e"
				.collect(Collectors.toList());
		System.out.println("\n Mix ordered by Strings containing e first:\n " +firstE);
		
		//e) Modifica todos los elementos de la matriz para cambiar los caracteres �a� a �4�. 
		List<String> changeAto4 = mix.stream() // recoge todos los elementos de la lista mix
				.map(w -> w.replaceAll("(?i)a", "4")) // los mapea y reemplaza todas las a por 4
				.collect(Collectors.toList());
		System.out.println("\n Changing a for 4:\n " +changeAto4);	
		
		//f) Muestra s�lo los elementos que sean 100% num�ricos (aunque est�n guardados como strings)
		List<String> justNumbers = mix.stream()
				.filter(w -> w.matches("[0-9]+")) //filtra y busca en la lista coincidencias con los caracteres del 0 al 9
				.collect(Collectors.toList());
		System.out.println("\n Strings with just numbers:\n " +justNumbers);
		
		//g) Crea una Functional Interface que contenga un m�todo abstracto operacion (), que retorne un valor float; 
		//   inyecta a la interfaz creada mediante una lambda el cuerpo del m�todo, 
		//   de manera que puedas transformar la operaci�n a una suma, resta, multiplicaci�n y divisi�n
		System.out.println();
		System.out.println(mates("suma",2,2));
		System.out.println(mates("resta",6,2));
		System.out.println(mates("division",2,1.64f));
		System.out.println(mates("multi",7.2f,2));
	}
	
	public static float mates (String a,float b, float c) {
		
		FunctionalInterface nuevo = null;
		if (a.equals("suma")) {
			nuevo = () -> b + c;
		}else if (a.equals("resta")) {
			nuevo = () -> b - c;
		}else if (a.equals("multi")) {
			nuevo = () -> b * c;
		}else if (a.equals("division")) {
			nuevo = () -> b / c;
		}else 
			System.out.print("Opci�n incorrecta");
		

		return nuevo.operation();
	}
}
