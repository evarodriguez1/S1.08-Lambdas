/*
 * Crea una Functional Interface que contenga un método abstracto reverse (), que retorne un valor String; 
 * en otra clase, inyecta a la interfaz creada mediante una lambda el cuerpo del método, 
 * de manera que torne la misma cadena que recibe como parámetro pero al revés. 
 * Invoca la instancia de la interfaz pasándole una cadena y comprobando el resultado.

 */
package n1fase3;

public class Main {

	public static void main(String[] args) {
		ReverseFunctionalInterface reverseString = (str) -> {
			String result = "";
			for(int i=str.length() -1; i >= 0; i--)
				result += str.charAt(i);
			return result;
		};
		System.out.println(reverseString.reverse("Hello world"));
	}

}
