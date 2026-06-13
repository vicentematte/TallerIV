/**
 * Estrategia concreta para calcular el poder de una carta de tipo Supporter.
 * La fórmula es: efectoPorTurno * 50.
 * Si la carta no es una instancia de de Supporter, se lanza una excepción.
 * @throws IllegalStateException Si la carta proporcionada no es de tipo Supporter
 */

public class PoderSupporterStrategy implements PoderStrategy {
	
	@Override
	public int calcularPoder(Carta carta) {
		if (!(carta instanceof Supporter)) {
			throw new IllegalStateException("Error: PoderSupporterStrategy asignada a una carta que no es un Supporter" + carta.getClass().getSimpleName());
		}		
		Supporter sup = (Supporter) carta;
		return (sup.getEfectoPorTurno()*50);
	}

}
