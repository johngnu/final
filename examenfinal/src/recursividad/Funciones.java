package recursividad;

/**
 *
 * @author desktop
 */
public class Funciones {

    public int suma(int n) {
        if (n == 1) {
            return (facto(fibo(n)) / potencia(impar(n), impar(n + 1)));
        } else {
            return (suma(n - 1) + (facto(fibo(n)) / potencia(impar(n), n + 1)));
        }
    }

    public int facto(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return (facto(n - 1) * n);
        }
    }

    public int fibo(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        } else {
            return (fibo(n - 2) + fibo(n - 1));
        }
    }

    public int potencia(int b, int e) {
        if (e <= 1) {
            if (e == 1) {
                return b;
            } else {
                return 1;
            }
        } else {
            return (potencia(b, e - 1) * b);
        }
    }
    
    public int impar(int n) {
        int i = 1;
        for (int j = 1; j < n; j++) {
            i += 2;
        }
        return i;
    }
}
