
public interface PoderStrategy {
	/**
	 * Strategy para poder calcular el poder de una carta.
	 * Cada implementacion define una formula específica segun.
	 * el tipo de carta.
	 * 
	 * @param carta La carta a la cual le calcularemos el poder
	 * @return el opder calculado como valor entero
	 */

	int calcularPoder(Carta carta);

}
