/**
 * Exercise: 9
 *
 * @version: 28/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que vaya generando números aleatorios pares entre 0 y 100
 * y que no termine de generar números hasta que no saque el 24. El programa
 * deberá decir al final cuántos números se han generado.
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        int count;

        // Var init
        count = 0;

        // Process
        do {
            num = (int) (Math.random() * 101);
            count++;
            System.out.printf("%4d: %4d\t", count, num);
        } while (num != 24);
        System.out.print("\nHe encotrado el 24 en " + count + " intentos.");
    }
}
