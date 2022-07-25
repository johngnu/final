package examenfinal;

/**
 *
 * @author desktop
 */
public class NodoM {

    private String nombreSeccion;
    private NodoD dato;
    private NodoM sig;

    public NodoM() {
        sig = null;
    }

    public String getNombreSeccion() {
        return nombreSeccion;
    }

    public void setNombreSeccion(String nombreSeccion) {
        this.nombreSeccion = nombreSeccion;
    }

    public NodoD getDato() {
        return dato;
    }

    public void setDato(NodoD dato) {
        this.dato = dato;
    }

    public NodoM getSig() {
        return sig;
    }

    public void setSig(NodoM sig) {
        this.sig = sig;
    }

}
