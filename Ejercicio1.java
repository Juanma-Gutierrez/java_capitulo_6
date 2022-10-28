/**
 * Exercise: 1
 *
 * @version: 27/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        int sum;

        // Var init
        sum = 0;

        // Process
        for (int i = 0; i < 3; i++) {
            num = (int) (Math.random() * 6) + 1;
            System.out.print(num + " ");
            sum += num;
        }
        System.out.print("\nLa suma de los números es: " + sum);

    }
}