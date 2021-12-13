/*
 * Crea una Functional Interface que contenga un m�todo abstracto reverse (), que retorne un valor String; 
 * en otra clase, inyecta a la interfaz creada mediante una lambda el cuerpo del m�todo, 
 * de manera que torne la misma cadena que recibe como par�metro pero al rev�s. 
 * Invoca la instancia de la interfaz pas�ndole una cadena y comprobando el resultado.

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
