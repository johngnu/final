package listamultiple;

/**
 *
 * @author desktop
 */
public class NodoM {

    private nodo dato;
    private NodoM sig;

    public NodoM() {
        sig = null;
    }

    public nodo getDato() {
        return dato;
    }

    public void setDato(nodo dato) {
        this.dato = dato;
    }

    public NodoM getSig() {
        return sig;
    }

    public void setSig(NodoM sig) {
        this.sig = sig;
    }

}
