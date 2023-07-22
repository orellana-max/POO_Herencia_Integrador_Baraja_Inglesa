package baraja.cartas;

/**
 * @author @author Maximiliano Orellana Mi perfil en GitHub:
 * https://github.com/orellana-max
 */
public abstract class Carta {

    private boolean tapada;

    public boolean isTapada() {
        return tapada;
    }

    public Carta() {
        // por defecto, 'tapada' es false
        this.tapada = true;
    }

    public void darVuelta() {
        tapada = !tapada;
    }

    public void mostrar() {

        if (tapada) {
            System.out.println("********");
        } else {
            System.out.println(getRepresentacion());
        }
    }

    public String getRepresentacion() {
        return "Carta Genérica";
    }

}
