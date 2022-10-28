/**
 * Exercise: 4
 *
 * @version: 27/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)
 * separados por espacios.
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        // Var declarations
        int num;

        // Process
        for (int i = 0; i < 20; i++) {
            num = (int) (Math.random() * 11) ;
            System.out.print(num + " ");
        }
    }
}
