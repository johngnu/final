package listamultiple;

/**
 *
 * @author desktop
 */
public class listaS {

    private nodo p;

    public listaS() {
        p = null;
    }

    public nodo getP() {
        return p;
    }

    public void setP(nodo p) {
        this.p = p;
    }

    public boolean esVacia() {
        if (getP() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void adiFinalLista(int x) {
        nodo nuevo = new nodo();
        nuevo.setDato(x);
        if (esVacia()) {
            setP(nuevo);
        } else {
            nodo q = getP();
            while (q.getSig() != null) {
                q = q.getSig();
            }
            q.setSig(nuevo);
        }
    }

    public void adiPrincipioLista(int x) {
        nodo nuevo = new nodo();
        nuevo.setDato(x);
        nuevo.setSig(p);
        setP(nuevo);
        /*if (esVacia()) {
            setP(nuevo);
        } else {
            nuevo.setSig(p);
            setP(nuevo);
        }*/
    }

    public void mostrarListaSimple() {
        nodo q = getP();
        int x;
        while (q != null) {
            x = q.getDato();
            System.out.print(" " + x);
            q = q.getSig();
        }
        System.out.println(" -- null");
    }

    public nodo eliNodoInicio() {
        nodo q = getP();
        if (getP() == null) {
            System.out.println("lista vacia");
        } else {
            p = p.getSig();
            q.setSig(null);
        }
        return q;
    }

    public nodo eliNodoFinal() {
        nodo q = getP();
        nodo r = getP();
        if (q.getSig() == null) {
            setP(null);
        } else {
            while (q.getSig() != null) {
                r = q;
                q = q.getSig();
            }
            r.setSig(null);
        }
        return q;
    }
}
