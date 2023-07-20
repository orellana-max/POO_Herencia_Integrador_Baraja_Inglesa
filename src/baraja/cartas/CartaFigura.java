package baraja.cartas;

import baraja.Palo;

/**
 * @author @author Maximiliano Orellana
 * Mi perfil en GitHub: https://github.com/orellana-max
 */
public class CartaFigura extends CartaConPalo {

    private char letra;

    public CartaFigura(char letra, Palo palo) {
        super(palo);
        this.letra = letra;
    }
    
    
    
}
