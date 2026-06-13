
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
