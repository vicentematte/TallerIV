/**
 * Representa una carta de tipo Energy.
 * cada carta Energy posee un nombre,
 * una rareza, un tipo y un elemento.
 */

public class Energy extends Carta{
	private String elemento;
	
	/**
	 * Constructor de la clase Energy.
	 * 
	 * @param nombreCarta El nombre de la carta Energy.
	 * @param rareza Nivel de rareza de la carta 1 el mas comun, 5 el mas raro.
	 * @param tipo Tipo de la carta.
	 * @param elemento Indica de que elemento es la carta Energy (Fire,Water, Fight, Lightning, Colorless, entre otros).
	 */
	
	public Energy(String nombreCarta, int rareza, String tipo, String elemento) {
		super(nombreCarta, rareza, tipo);
		this.elemento = elemento;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	@Override
	public String toString() {
		return super.toString() +"Energy [elemento=" + elemento + "]";
	}

	@Override
	public void aceptar(CartaVisitor visitor) {
		visitor.visitar(this);
	}

}
