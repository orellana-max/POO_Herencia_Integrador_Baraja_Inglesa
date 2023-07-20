package baraja.cartas;

import baraja.Palo;

/**
 * @author @author Maximiliano Orellana
 * Mi perfil en GitHub: https://github.com/orellana-max
 */
public class CartaNumeral extends CartaConPalo{
    
    private int numero;

    public CartaNumeral(int numero, Palo palo) {
        super(palo);
        this.numero = numero;
    }
    
    

}
