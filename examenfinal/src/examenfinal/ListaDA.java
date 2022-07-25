package examenfinal;

/**
 *
 * @author desktop
 */
public class ListaDA {

    private NodoD p;

    public ListaDA() {
        p = null;
    }

    public NodoD getP() {
        return p;
    }

    public void setP(NodoD p) {
        this.p = p;
    }

    public boolean esVacia() {
        if (getP() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void adiFinalLD(Automovil x) {
        NodoD nuevo = new NodoD();
        nuevo.setDato(x);
        if (esVacia()) {
            setP(nuevo);
        } else {
            NodoD q = getP();
            while (q.getSig() != null) {
                q = q.getSig();
            }
            q.setSig(nuevo);
        }
    }

    public void mostrarLDEmp() {
        NodoD q = getP();
        while (q != null) {
            q.getDato().mostrar();
            q = q.getSig();
        }
    }

    public int nroNodos() {
        NodoD q = getP();
        int c = 0;
        while (q != null) {
            c++;
            q = q.getSig();
        }
        return c;
    }
}
