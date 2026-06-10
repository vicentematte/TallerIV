import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
	private ArrayList<Carta> listaCartas = new ArrayList<>();
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
			//s.nextLine();
			
			while(s.hasNextLine()) {
				String linea = s.nextLine();
				String[] partes = linea.split(";");
				
				String nombreCarta = partes[0];
				String rareza = partes[1];
				String tipo = partes[2];
				
				//Dependiendo del "Tipo" de carta que sea, la guardaremos en la arraylist con su respectivo constructor.
				if (tipo.equalsIgnoreCase("Pokemon")) {
					Pokemon p = new Pokemon(nombreCarta,rareza,tipo,Integer.parseInt(partes[3]),Integer.parseInt(partes[4]));
					listaCartas.add(p);
				}else if (tipo.equalsIgnoreCase("Item")) {
					Item i = new Item(nombreCarta,rareza,tipo,Integer.parseInt(partes[3])); 
					listaCartas.add(i);
				}else if (tipo.equalsIgnoreCase("Supporter")) {
					Supporter sup = new Supporter(nombreCarta,rareza,tipo,Integer.parseInt(partes[3])); 
					listaCartas.add(sup);
				}else if (tipo.equalsIgnoreCase("Energy")) {
					Energy e = new Energy(nombreCarta,rareza,tipo,partes[3]);
					listaCartas.add(e);
					
				}

				
				
				
				System.out.println(linea);
			}
			
			
		}catch(FileNotFoundException e) {
			System.out.println("Archivos no encontrado");
			
		}

	}
	
}
