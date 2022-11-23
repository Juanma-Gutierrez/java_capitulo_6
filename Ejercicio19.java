/**
 * Exercise: 19
 *
 * @version: 28/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos
 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
 * luego el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados.
 */

public class Ejercicio19 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        int max;
        int min;
        int media;

        // Var init
        min = -100;
        max = 200;
        media = 0;

        // Process
        for (int i = 0; i < 50; i++) {
            num = (int) ((Math.random() * (max - min)) + min);
            if (num > max && num % 2 == 0)
                max = num;
            if (num < min && num % 2 != 0)
                min = num;
            System.out.print(num + " ");
            media += num;
        }
        System.out.println("\nNúmero par más alto: " + max);
        System.out.println("Número impar más bajo: " + min);
        System.out.printf("Media de todos los números: %.2f", ((float) media / 50));
    }
}
