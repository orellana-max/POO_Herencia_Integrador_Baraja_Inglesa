package baraja.cartas;

import baraja.Palo;

/**
 * @author @author Maximiliano Orellana Mi perfil en GitHub:
 * https://github.com/orellana-max
 */
public abstract class CartaConPalo extends Carta {

    private Palo palo;

    public CartaConPalo(Palo palo) {
        //super();
        this.palo = palo;
    }

    @Override
    public String getRepresentacion() {
        return " de " + palo;
    }

}
