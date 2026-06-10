/**
 * Representa una carta de tipo Pokemon.
 * Cada carta posee un nombre, una rareza, un daño de ataque
 * y una cantidad de energías.
 */

public class Pokemon extends Carta{
	private int daño;
	private int cantEnergias;
	
	/**
	 * Constructor de la clase Pokemon.
	 * 
	 * @param nombreCarta Nombre del Pokemon.
	 * @param rareza Nivel de rareza de la carta 1 siendo el mas común y 5 de lo mas raro.
	 * @param tipo Naturaleza de la carta.
	 * @param daño Daño de ataque del Pokemon.
	 * @param cantEnergias Cantidad de energia que posee el Pokemon.
	 */
	
	
	public Pokemon(String nombreCarta, int rareza, String tipo, int daño, int cantEnergias) {
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
	
	//Calculo de poder para la clase Pokemon mediante la interfaz de Calculable
	@Override
	public int calcularPoder() {
		return (getDaño()/getCantEnergias())*100;
	}
	
	
}
