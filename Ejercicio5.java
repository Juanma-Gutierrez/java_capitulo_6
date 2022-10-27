/**
 * Exercise: 5
 *
 * @version: 27/10/2022 20:48
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media de
 * esos números.
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        int max;
        int min;
        int sum;

        // Var init
        max = 100;
        min = 199;
        sum = 0;

        // Process
        for (int i = 0; i < 50; i++) {
            num = (int) (Math.random() * 100) + 100;
            if (num > max)
                max = num;
            if (num < min)
                min = num;
            sum += num;
            System.out.print(num + " ");
        }
        System.out.println("\nNúmero mayor: " + max);
        System.out.println("Número menor: " + min);
        System.out.printf("Media: %.2f", (float) sum / 50);
    }
}
