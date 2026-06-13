import java.util.ArrayList;

/**
 * Fabrica para crear cartas desde el archivo.
 * Segun el tipo (Pokemon, Energy, etc.) crea la carta que corresponda,
 * se le asigna su estrategia de poder y se guarda en la lista.
 */

public class CartaFactory {
	private static ArrayList<Carta> listaCartas = new ArrayList<>();

	
	/**
     * Devuelve la lista de todas las cartas creadas.
     * @return ArrayList con las cartas.
     */
	public static ArrayList<Carta> getListaCartas() {
		return listaCartas;
	}
	
    /**
     * Dependiendo del "Tipo" de carta que sea, 
     * la guardaremos en la arraylist con su respectivo constructor.
     * Gracias a la implementacion de CartaFactory, ella es la encargada de ese trabajo.
     * @param datos nombre, rareza, tipo, y otros datos según el tipo.
     * @return La carta creada (Pokemon, Energy, etc.) o null si el tipo no es válido.
     */
	
	public static Carta crearCarta(String[] datos) {
		String nombreCarta = datos[0];
		int rareza = Integer.parseInt(datos[1]);
		String tipo = datos[2];
		
		if (tipo.equalsIgnoreCase("Pokemon")) {
			Pokemon p = new Pokemon(nombreCarta,rareza,tipo,Integer.parseInt(datos[3]),Integer.parseInt(datos[4]));
			listaCartas.add(p);
			p.setEstrategiaPoder(new PoderPokemonStrategy());
			return p;
			
		}else if (tipo.equalsIgnoreCase("Item")) {
			Item i = new Item(nombreCarta,rareza,tipo,Integer.parseInt(datos[3])); 
			listaCartas.add(i);
			i.setEstrategiaPoder(new PoderItemStrategy());
			return i;
			
		}else if (tipo.equalsIgnoreCase("Supporter")) {
			Supporter sup = new Supporter(nombreCarta,rareza,tipo,Integer.parseInt(datos[3])); 
			listaCartas.add(sup);
			sup.setEstrategiaPoder(new PoderSupporterStrategy());
			return sup;
			
		}else if (tipo.equalsIgnoreCase("Energy")) {
			Energy e = new Energy(nombreCarta,rareza,tipo,datos[3]);
			listaCartas.add(e);
			e.setEstrategiaPoder(new PoderEnergyStrategy());
			return e;	
		}
		return null;
	
	}

}
