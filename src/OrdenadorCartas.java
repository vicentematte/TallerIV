import java.util.ArrayList;

public class OrdenadorCartas {
	
	//Por nombre
	public static void ordenarPorNombre(ArrayList<Carta> lista) {
		int cantidad = lista.size();
		//-1 por que se da a entender que el ultimo siempre sera el ultimo xd
		for (int i = 0; i < cantidad-1; i++){
			for (int j = 0; j < cantidad-1; j++) {
				String nombre1 = lista.get(j).getNombreCarta();
				String nombre2 = lista.get(j+1).getNombreCarta();
				
				//Si nombre1 es mayor alfabeticamente que nombre2, se intercambia
				if (nombre1.compareToIgnoreCase(nombre2) > 0) {
					Carta aux = lista.get(j);
					lista.set(j, lista.get(j+1));
					lista.set(j+1, aux);
					
				}
			}
		}
	}
	//Por poder
	public static void ordenarPorPoder(ArrayList<Carta> lista) {
		int cantidad = lista.size();
		
		for (int i = 0; i < cantidad-1; i++) {
			for (int j = 0; j < cantidad-1; j++) {
				
				int poder1 = lista.get(j).calcularPoder();
				int poder2 = lista.get(j+1 ).calcularPoder();
				
				if (poder1 > poder2) {
					Carta aux = lista.get(j);
					lista.set(j, lista.get(j+1));
					lista.set(j+1, aux);
				}
				
			}
		}
		
	}
	
	//Por  rareza
	public static void ordenarPorRareza(ArrayList<Carta> lista) {
		int cantidad = lista.size();
		for (int i = 0; i < cantidad -1; i++) {
			for (int j = 0; j< cantidad -1; j++) {
				int rareza1 = lista.get(j).getRareza();
				int rareza2 = lista.get(j+1).getRareza();
				
				if (rareza1 > rareza2) {
					Carta aux = lista.get(j);
					lista.set(j, lista.get(j+1));
					lista.set(j+1, aux);
			}
		}
	}
	
}
}