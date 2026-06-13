/**
 * Representa una carta de tipo Item.
 * Cada item posee un nombre, una rareza,
 * un tipo y una bonificacion.
 */

public class Item extends Carta{
	private int bonificacion;
	
	/**
	 * Constructor de la clase Item.
	 * 
	 * @param nombreCarta Nombre que tendrá el Item
	 * @param rareza nivel de rareza de la carta 1 el mas comun, 5 el mas raro.
	 * @param tipo Naturaleza de la carta.
	 * @param bonificacion Valor de bonificacion que otorga el Item.
	 * 	 
	 */
	
	public Item(String nombreCarta, int rareza, String tipo, int bonificacion) {
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
