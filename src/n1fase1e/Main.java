/*
 * Cree una  lista  con el n�mero de meses  del  a�o .
 *  Imprim todos los elementos  de la lista  con  una lambda.            
 */
package n1fase1e;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> months = Arrays.asList("Ene","Feb","Marzo","Abr",
				"Mayo","Jun","Jul","Agos","Sept","Oct","Nov","Dic");
		System.out.println("Months: ");
		months.forEach(m -> System.out.println(m+" "));
	}

}
