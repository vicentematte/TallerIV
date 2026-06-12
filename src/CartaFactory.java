import java.util.ArrayList;

public class CartaFactory {
	private static ArrayList<Carta> listaCartas = new ArrayList<>();

	/**
	 * 
	 * 
	 */
	public static Carta crearCarta(String[] datos) {
		String nombreCarta = datos[0];
		int rareza = Integer.parseInt(datos[1]);
		String tipo = datos[2];
		
		/**Dependiendo del "Tipo" de carta que sea, 
		 * la guardaremos en la arraylist con su respectivo constructor.
		 * Gracias a la implementacion de CartaFactory.
		 */
		if (tipo.equalsIgnoreCase("Pokemon")) {
			Pokemon p = new Pokemon(nombreCarta,rareza,tipo,Integer.parseInt(datos[3]),Integer.parseInt(datos[4]));
			listaCartas.add(p);
			return p;
			
		}else if (tipo.equalsIgnoreCase("Item")) {
			Item i = new Item(nombreCarta,rareza,tipo,Integer.parseInt(datos[3])); 
			listaCartas.add(i);
			return i;
			
		}else if (tipo.equalsIgnoreCase("Supporter")) {
			Supporter sup = new Supporter(nombreCarta,rareza,tipo,Integer.parseInt(datos[3])); 
			listaCartas.add(sup);
			return sup;
			
		}else if (tipo.equalsIgnoreCase("Energy")) {
			Energy e = new Energy(nombreCarta,rareza,tipo,datos[3]);
			listaCartas.add(e);
			return e;	
			
		}
		return null;
	
	}
}
