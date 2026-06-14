import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * Clase principal del sistema. Lee las cartas desde un archivo de texto.
 * y delega el crear cartas a la clase CartaFactory.
 * Se implementa el patron Singleton.
 */

public class Sistema {
	private static Sistema instancia;
	
	/** Constructor privado para singleton */
	private Sistema() {
	}
	
	/**
	 * Implementé el patron Singleton para la clase Sistema.
	 * Retorna la unica instancia del sistema o creándola si no existe.
	 *
	 * @return retorna la instancia unica del Sistema
	 */
	public static Sistema getInstancia() {
		if (instancia == null) {
			instancia = new Sistema();
		}return instancia;
	}

	private Scanner s;
	private File file;

	/**
     * Abre el archivo "Sobres.txt", lo lee y crea las cartas
     * y las guarda dependiendo del tipo en una ArrayList.
     *
     * @throws FileNotFoundException Si el archivo no existe o esta mas escrito.
     */
	
	public void abrirSobres() {
		try {
			file = new File("Sobres.txt");
			s = new Scanner(file);
			
			while(s.hasNextLine()) {
				String linea = s.nextLine();
				String[] datos = linea.split(";");
				
				CartaFactory.crearCarta(datos);
			}

		}catch(FileNotFoundException e) {
			System.out.println("Archivos no encontrado");
			
		}
	}
	public void agregarCarta(Carta carta){
		
	}
	public void eliminarCarta(String nombre) {
		
	}
	
}
