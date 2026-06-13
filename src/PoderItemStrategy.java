/**
 * Estrategia concreta para calcular el poder de una carta de tipo Item.
 * La fórmula es: bonificacion * 50.
 * Si la carta no es una instancia de {@link Item}, se lanza una excepción.
 * @throws IllegalStateException si la carta proporcionada no es de tipo Item
 */

public class PoderItemStrategy implements PoderStrategy{
	
	@Override
	public int calcularPoder(Carta carta) {
		if (!(carta instanceof Item)) {
			throw new IllegalStateException("Error: PoderSupporterStrategy asignada a una carta que no es un Item" + carta.getClass().getSimpleName());
		}
		Item i = (Item) carta;
		return (i.getBonificacion()*20);
	}
}
