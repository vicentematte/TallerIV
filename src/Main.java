

public class Main {

	public static void main(String[] args) {
		/**
		 * Singelton; si la instancia sistema ya estuviese creada, 
		 * no se se crea una nueva.
		 * se instanciaria ella misma
		 */
		
		Sistema sistema = Sistema.getInstancia();
		sistema.abrirSobres();
		}
}
