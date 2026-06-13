/**
 * Estrategia concreta para calcular el poder de una carta de tipo Energy.
 * Las cartas de energía no tienen poder como tal, por lo que siempre retorna 1.
 * @throws IllegalStateException si la carta proporcionada no es una instancia de Energy.
 */

public class PoderEnergyStrategy implements PoderStrategy {
	
	@Override
	public int calcularPoder(Carta carta) {
		if (!(carta instanceof Energy)) {
			throw new IllegalStateException("Error: PoderEnergyStrategy asignada a una carta que no es Energy (" + carta.getClass().getSimpleName()+").");
		}
		return 1;
	}
}
