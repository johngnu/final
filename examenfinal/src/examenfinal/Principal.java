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
        
        a1.mostrar();
    }
    
}
