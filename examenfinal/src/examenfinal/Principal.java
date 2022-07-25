package examenfinal;

/**
 *
 * @author desktop
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil a1 = new Automovil("bmw", 2019, "deportivo", "azul", 30000);
        Automovil a2 = new Automovil("ford", 2020, "fiesta", "rojo", 20000);
        Automovil a3 = new Automovil("fiat", 2022, "500x", "plomo", 22000);

        Automovil a4 = new Automovil("honda", 2021, "jazz", "blanco", 21000);
        Automovil a5 = new Automovil("jeep", 2022, "cherokee", "plomo", 51000);

        Automovil a6 = new Automovil("isuzu", 2020, "bronco", "plomo", 23000);

        ListaAutomovil lda1 = new ListaAutomovil();
        lda1.adiFinalLD(a1);
        lda1.adiFinalLD(a2);
        lda1.adiFinalLD(a3);

        ListaAutomovil lda2 = new ListaAutomovil();
        lda2.adiFinalLD(a1);
        lda2.adiFinalLD(a2);

        ListaAutomovil lda3 = new ListaAutomovil();
        lda3.adiFinalLD(a1);

        lda1.mostrarLD();
    }

}
