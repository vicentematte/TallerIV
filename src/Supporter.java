/**
 * Representa la carta de tipo Supporter.
 * Cada Supporter posee un nombre, una rareza,
 * un tipo y un efecto por turno.
 */


public class Supporter extends Carta{
	private int efectoPorTurno;

	/**
	 * Constructor de la clase Supporter.
	 * 
	 * @param nombreCarta Nombre del Supporter.
	 * @param rareza Nivel de rareza de la carta 1 el mas comun, 5 el mas raro.
	 * @param tipo Tipo de la carta.
	 * @param efectoPorTurno Efecto que puede utilizar el Supporter por turno.
	 */
	
	public Supporter(String nombreCarta, int rareza, String tipo, int efectoPorTurno) {
		super(nombreCarta, rareza, tipo);
		this.efectoPorTurno = efectoPorTurno;
	}

	public int getEfectoPorTurno() {
		return efectoPorTurno;
	}

	public void setEfectoPorTurno(int efectoPorTurno) {
		this.efectoPorTurno = efectoPorTurno;
	}

	@Override
	public String toString() {
		return super.toString() + "Supporter [efectoPorTurno=" + efectoPorTurno + "]";
	}

}
