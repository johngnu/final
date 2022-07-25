package recursividad;

/**
 *
 * @author desktop
 */
public class Funciones {

    public int suma(int n) {
        if (n == 1) {
            return (facto(fibo(n)) / potencia(primo(n), primo(n + 1)));
        } else {
            return (suma(n - 1) + (facto(fibo(n)) / potencia(primo(n), primo(n + 1))));
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

    public int primo(int n) {
        int num, count, i;
        num = 1;
        count = 0;
        while (count < n) {
            num = num + 1;
            for (i = 2; i <= num; i++) { //Here we will loop from 2 to num
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {//if it is a prime number
                count = count + 1;
            }
        }
        return num;
    }
}
