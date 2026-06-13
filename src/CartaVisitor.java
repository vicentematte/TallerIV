/**
 * Visitante que puede realizar operaciones sobre cualquier tipo de carta.
 * (Aun no se como, solo se la teoria)
 */
public interface CartaVisitor {
    void visitar(Pokemon pokemon);
    void visitar(Energy energy);
    void visitar(Supporter supporter);
    void visitar(Item item);
}