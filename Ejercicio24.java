/**
 * Exercise: 24
 *
 * @version: 28/10/2022 21:22
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que, dado un número introducido por teclado, elija al
 * azar uno de sus dígitos.
 */

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        // Var declarations
        long num;
        long aux;
        int numLength;
        int position;

        // Var init
        numLength = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca un número entero positivo: ");
        num = sc.nextLong();

        // Process
        // Get number length
        aux = num;
        do {
            aux /= 10;
            numLength++;
        } while (aux > 0);

        // Get random number
        position = (int) (Math.random() * numLength) + 1;

        // Get position number
        for (int i = 1; i <= position; i++) {
            aux = num % 10;
            num /= 10;
        }
        System.out.print(aux);
        sc.close();
    }
}
