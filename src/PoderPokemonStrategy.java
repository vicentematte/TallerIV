/**
 * Estrategia unica para calcular el poder de una carta de tipo Pokemon.
 *
 * La fórmula es: (daño / cantidad de energías) * 100.
 * Si la carta no es un Pokemon, se lanza una excepción.
 * Si la cantidad de energía es cero, se retorna 0 para evitar división por cero.
 * 
 * @throws IllegalStateException si la carta proporcionada no es una instancia de Pokemon.
 */

public class PoderPokemonStrategy implements PoderStrategy{

	@Override
	public int calcularPoder(Carta carta) {
		
		if (!(carta instanceof Pokemon)) {
			throw new IllegalStateException("Error: PoderPokemonStrategy asignada a una carta que no es un Pokemon " + carta.getClass().getSimpleName());
		}

		Pokemon p = (Pokemon) carta;
		if (p.getCantEnergias() == 0) {
			return 0;
		}
		return ((p.getDaño()/ p.getCantEnergias()) * 100);
	}

}
