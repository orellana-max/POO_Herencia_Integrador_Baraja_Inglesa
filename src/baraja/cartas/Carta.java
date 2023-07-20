package baraja.cartas;

/**
 * @author @author Maximiliano Orellana Mi perfil en GitHub:
 * https://github.com/orellana-max
 */
public abstract class Carta {
    
    private boolean tapada;
    
    public Carta() {
    // por defecto, 'tapada' es false
    }
    
    public void mostrar(){
    
    }
    
    public void darVuelta(){}

    @Override
    public String toString() {
        return "Carta{" + "tapada=" + tapada + '}';
    }
    
    
    
}
