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
        Auto a1 = new Auto("bmw", 2019, "deportivo", "azul", 30000);
        Auto a2 = new Auto("ford", 2020, "fiesta", "rojo", 20000);
        Auto a3 = new Auto("fiat", 2022, "500x", "plomo", 22000);
        
        a1.mostrar();
    }
    
}
