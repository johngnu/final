package recursividad;

/**
 *
 * @author desktop
 */
public class Princiapal {

    public static void main(String[] args) {
        Funciones fc = new Funciones();
        //System.out.println(fc.facto(fc.fibo(1)));
        //System.out.println(fc.potencia(fc.fibo(1)));
        for (int i = 1; i <= 6; i++) {
            System.out.print(" " + fc.fibo(i));
        }
        System.out.println();    
        for (int i = 1; i <= 6; i++) {
            System.out.print(" " + fc.impar(i));
        }        
        System.out.println();    
        

            
        
        
        System.out.println(fc.suma(2));
    }
}
