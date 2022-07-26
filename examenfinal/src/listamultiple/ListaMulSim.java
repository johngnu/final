package listamultiple;

/**
 *
 * @author desktop
 */
public class ListaMulSim {

    private NodoM pm;

    public ListaMulSim() {
        pm = null;
    }

    public NodoM getPm() {
        return pm;
    }

    public void setPm(NodoM pm) {
        this.pm = pm;
    }

    public boolean esVacia() {
        if (getPm() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void adiFinalLMS(nodo p) {
        NodoM nuevo = new NodoM();
        nuevo.setDato(p);
        if (esVacia()) {
            setPm(nuevo);
        } else {
            NodoM qm = getPm();
            while (qm.getSig() != null) {
                qm = qm.getSig();
            }
            qm.setSig(nuevo);
        }
    }

    public void adiPrincipioLMS(nodo p) {
        NodoM nuevo = new NodoM();
        nuevo.setDato(p);
        if (esVacia()) {
            setPm(nuevo);
        } else {
            nuevo.setSig(pm);
            setPm(nuevo);
        }
    }

    public void mostrarLMS() {
        NodoM qm = getPm();
        listaS lis = new listaS();
        while (qm != null) {
            lis.setP(qm.getDato());
            lis.mostrarListaSimple();
            System.out.println("---------------------------------");
            qm = qm.getSig();
        }
    }
}
