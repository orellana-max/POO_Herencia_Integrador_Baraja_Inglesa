package baraja.cartas;

/**
 * @author @author Maximiliano Orellana
 * Mi perfil en GitHub: https://github.com/orellana-max
 */
public class CartaJoker extends Carta {
    
    private boolean aColor;

    public CartaJoker(boolean aColor) {
        //super();
        this.aColor = aColor;
    }
    
    @Override
    public String getRepresentacion() {
        return "Joker " + (aColor? "a colores" : "blanco y negro");
    }
    

    
}
