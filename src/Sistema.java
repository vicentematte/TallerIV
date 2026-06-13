import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sistema {
	private static Sistema instancia;
	
	private Sistema() { //constructor
	}
	
	//Singleton
	public static Sistema getInstancia() {
		if (instancia == null) {
			instancia = new Sistema();
		}return instancia;
	}

	private Scanner s;
	private File file;

	
	//Apertura del archivo junto con el guardado de los objetos (Pokemon,Item,Supporter y Energy) en una ArrayList de Cartas.
	public void abrirSobres() {
		try {
			file = new File("Sobres.txt");
			s = new Scanner(file);
			
			while(s.hasNextLine()) {
				String linea = s.nextLine();
				String[] datos = linea.split(";");
				
				Carta carta = CartaFactory.crearCarta(datos);
				
			}
			
		//En caso de no encontrar la ruta del archivo, nos reportará la excepcion
		}catch(FileNotFoundException e) {
			System.out.println("Archivos no encontrado");
			
		}

	}
	
}
