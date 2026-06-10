
public class Supporter extends Carta{
	private int efectoPorTurno;

	public Supporter(String nombreCarta, String rareza, String tipo, int efectoPorTurno) {
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
