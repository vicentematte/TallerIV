
public abstract class Carta {
	private String nombreCarta;
	private String rareza;
	private String tipo;
	public Carta(String nombreCarta, String rareza, String tipo) {
		super();
		this.nombreCarta = nombreCarta;
		this.rareza = rareza;
		this.tipo = tipo;
	}
	public String getNombreCarta() {
		return nombreCarta;
	}
	public void setNombreCarta(String nombreCarta) {
		this.nombreCarta = nombreCarta;
	}
	public String getRareza() {
		return rareza;
	}
	public void setRareza(String rareza) {
		this.rareza = rareza;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Carta [nombreCarta=" + nombreCarta + ", rareza=" + rareza + ", tipo=" + tipo + "]";
	}
	
	
	
	
}
