package listamultiple;

/**
 *
 * @author desktop
 */
public class nodo {

    private int dato;
    private nodo sig;

    public nodo() {
        sig = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public nodo getSig() {
        return sig;
    }

    public void setSig(nodo sig) {
        this.sig = sig;
    }

}
