/**
 * Exercise: 7
 *
 * @version: 27/10/2022 21:26
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas).
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        String res;

        // Process
        for (int i = 1; i <= 15; i++) {
            System.out.printf("%-5s", i);
            for (int j = 0; j < 3; j++) {
                num = (int) (Math.random() * 3);
                if (num == 0)
                    res = "X";
                else
                    res = String.valueOf(num);
                System.out.printf("%-3s", res);
            }
            System.out.println();
        }

    }
}
