
public class InformeVisitor implements CartaVisitor{
	private String acumuladorTexto = "";
	
	@Override
	public void visitar(Pokemon pokemon) {
		
		acumuladorTexto += "Pokemon: "+ pokemon.getNombreCarta() + " | Poder: " + pokemon.calcularPoder() + " | Rareza: " + pokemon.getRareza() + "\n";
	}
	@Override
	
	public void visitar(Energy energy) {
		acumuladorTexto += "Energy: " + energy.getNombreCarta() + " | Poder: " + energy.calcularPoder() + " | Rareza: " + energy.getRareza()+ "\n";
	}

	@Override
	public void visitar(Supporter supporter) {
		acumuladorTexto += "Supporter: " + supporter.getNombreCarta() + " | Poder: " + supporter.calcularPoder() + " | Rareza: " + supporter.getRareza()+ "\n";
		
	}

	@Override
	public void visitar(Item item) {
		acumuladorTexto += "Item: " + item.getNombreCarta() + " | Poder: " + item.calcularPoder() + " | Rareza: " + item.getRareza()+ "\n";
		
	}
	public String getTexto() {
		return acumuladorTexto;
	}

}
