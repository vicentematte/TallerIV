
public class Item extends Carta{
	private int bonificacion;

	public Item(String nombreCarta, String rareza, String tipo, int bonificacion) {
		super(nombreCarta, rareza, tipo);
		this.bonificacion = bonificacion;
	}

	public int getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(int bonificacion) {
		this.bonificacion = bonificacion;
	}

	@Override
	public String toString() {
		return super.toString() + "Item [bonificacion=" + bonificacion + "]";
	}
	
	
}
