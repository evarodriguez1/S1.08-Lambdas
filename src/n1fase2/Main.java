/*
 * Creo en  una  Functional  Interfaz que  conting a  un  método abstracto getPiValue  (), 
 * que devuelve en  un valor  double ; en  otra clase , instancie la  interfaz  
 * y  asigne mediante  una lambda el valor 3.1415. 
 * Invo en  el  método getPiValue  la  interfaz de solicitud  e Imprim  el  resultado .            
 */
package n1fase2;

public class Main {

	public static void main(String[] args) {
	
		InterfacePi pi = () -> 3.14516;  //se instancia la interfaz mediante lambda
		System.out.println(pi.getPiValue());
		//System.out.println(pi);

	}

}
