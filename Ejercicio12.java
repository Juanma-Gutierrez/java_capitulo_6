/**
 * Exercise: 12
 *
 * @version: 28/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo
 * Matrix) con el código ascii entre el 32 y el 126. Puedes hacer casting con
 * (char) para convertir un entero en un carácter.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        // Var declarations
        int num;

        System.out.print("\033[32m");
        for (int i = 0; i < 10000; i++) {
            num = (int) ((Math.random() * 95) + 32);
            System.out.print((char) (num));
        }
        System.out.print("\033[37m");
    }
}
