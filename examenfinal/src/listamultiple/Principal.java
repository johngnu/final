package listamultiple;

/**
 *
 * @author desktop
 */
public class Principal {

    public static void main(String[] args) {
        listaS ls1 = new listaS();
        ls1.adiFinalLista(50);
        ls1.adiFinalLista(10);
        ls1.adiFinalLista(30);
        ls1.adiFinalLista(110);
        
        listaS ls2 = new listaS();
        ls2.adiPrincipioLista(4);
        ls2.adiPrincipioLista(5);
        ls2.adiPrincipioLista(6);        
        //ls2.mostrarListaSimple();
                
        listaS ls3 = new listaS();
        ls3.adiFinalLista(6);
        ls3.adiFinalLista(8);
        ls3.adiFinalLista(30);
        
        ListaMulSim lms = new ListaMulSim();
        lms.adiFinalLMS(ls1.getP());
        lms.adiFinalLMS(ls2.getP());
        lms.adiFinalLMS(ls3.getP());
        
        lms.mostrarLMS();
    }
}
