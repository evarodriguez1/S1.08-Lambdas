/*
 * Tienes que  hacer  la  misma impresi�n  del  punto  anterior  pero haci�ndolo mediante method reference .  
 */
package n1fase1f;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> months = Arrays.asList("Ene","Feb","Marzo","Abr",
				"Mayo","Jun","Jul","Agos","Sept","Oct","Nov","Dic");
		System.out.println("Months whit method reference: ");
		months.forEach(System.out::println);
	}

}
