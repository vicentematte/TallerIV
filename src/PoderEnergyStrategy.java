
public class PoderEnergyStrategy implements PoderStrategy {
	
	/**
	 * Estrategia concreta para calcular el poder de una carta de tipo Energy.
	 * <p>
	 * Las cartas de energía no tienen poder ofensivo propio, por lo que siempre retornan 0.
	 * </p>
	 *
	 * @throws IllegalStateException si la carta proporcionada no es una instancia de Energy.
	 */
	@Override
	public int calcularPoder(Carta carta) {
		if (!(carta instanceof Energy)) {
			throw new IllegalStateException("Error: PoderEnergyStrategy asignada a una carta que no es Energy" + carta.getClass().getSimpleName());
		}
		return 1;
	}
}
