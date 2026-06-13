
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
