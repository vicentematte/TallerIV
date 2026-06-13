
/**
 * Representará una carta pokemon que posean los jugadores.
 * Cada carta posee un nombre, una rareza y un tipo.
 */

public abstract class Carta{
	private String nombreCarta;
	private int rareza;
	private String tipo;
	private PoderStrategy estrategiaPoder;
	
	/** 
	 * Constructor de la clase carta
	 * 
	 * 	@param nombreCarta: Nombre que posee la carta 
	 * 	@param rareza: Niveles de rareza (1,2,3,4,5) siendo 1 el mas comun y 5 el mas raro.
	 * 	@param tipo: Naturaleza de la carta (Pokemon, Item, Supporte y Energy)
	 */
	
	public Carta(String nombreCarta, int rareza, String tipo) {
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
	public int getRareza() {
		return rareza;
	}
	public void setRareza(int rareza) {
		this.rareza = rareza;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public PoderStrategy getEstrategiaPoder() {
		return estrategiaPoder;
	}
	public void setEstrategiaPoder(PoderStrategy estrategiaPoder) {
		this.estrategiaPoder = estrategiaPoder;
	}
	
	public abstract void aceptar(CartaVisitor visitor);
	
	
    public int calcularPoder() {
        if (estrategiaPoder == null) {
            throw new IllegalStateException("No se ha asignado una estrategia de poder a la carta " + nombreCarta);
        }
        return estrategiaPoder.calcularPoder(this);
    }
	
	@Override
	public String toString() {
		return "Carta [nombreCarta=" + nombreCarta + ", rareza=" + rareza + ", tipo=" + tipo + "]";
	}
	

	
	
	
	
}
