package examenfinal;

/**
 *
 * @author desktop
 */
public class NodoD {

    private Automovil dato;
    private NodoD ant;
    private NodoD sig;

    public NodoD() {
        ant = sig = null;
    }

    public Automovil getDato() {
        return dato;
    }

    public void setDato(Automovil dato) {
        this.dato = dato;
    }

    public NodoD getAnt() {
        return ant;
    }

    public void setAnt(NodoD ant) {
        this.ant = ant;
    }

    public NodoD getSig() {
        return sig;
    }

    public void setSig(NodoD sig) {
        this.sig = sig;
    }

}
