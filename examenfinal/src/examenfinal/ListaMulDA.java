package examenfinal;

/**
 *
 * @author desktop
 */
public class ListaMulDA {

    private NodoM pm;

    public ListaMulDA() {
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

    public void adiFinalLSM(String n, ListaAutomovil le) {
        NodoM nuevo = new NodoM();
        nuevo.setNombreSeccion(n);
        nuevo.setDato(le.getP());
        if (esVacia()) {
            setPm(nuevo);
        } else {
            NodoM q = getPm();
            while (q.getSig() != null) {
                q = q.getSig();
            }
            q.setSig(nuevo);
        }
    }

    public void mostrarLSM() {
        NodoM q = getPm();
        ListaAutomovil lis = new ListaAutomovil();
        while (q != null) {
            System.out.println("Seccion: " + q.getNombreSeccion());
            lis.setP(q.getDato());
            lis.setP(q.getDato());
            lis.mostrarLD();
            q = q.getSig();
            System.out.println("*******************************");
        }
    }
}
