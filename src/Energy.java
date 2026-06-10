
public class Energy extends Carta{
	private String elemento;

	public Energy(String nombreCarta, String rareza, String tipo, String elemento) {
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
	
}
