
public class Pokemon extends Carta{
	private int daño;
	private int cantEnergias;
	public Pokemon(String nombreCarta, String rareza, String tipo, int daño, int cantEnergias) {
		super(nombreCarta, rareza, tipo);
		this.daño = daño;
		this.cantEnergias = cantEnergias;
	}
	public int getDaño() {
		return daño;
	}
	public void setDaño(int daño) {
		this.daño = daño;
	}
	public int getCantEnergias() {
		return cantEnergias;
	}
	public void setCantEnergias(int cantEnergias) {
		this.cantEnergias = cantEnergias;
	}
	@Override
	public String toString() {
		return super.toString() + "Pokemon [daño=" + daño + ", cantEnergias=" + cantEnergias + "]";
	}
	
	
}
