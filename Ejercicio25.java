/**
 * Exercise: 25
 *
 * @version: 28/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que muestre por pantalla 100 números enteros separados
 * por un espacio. Los números deben estar generados de forma aleatoria en un
 * rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
 * almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej.
 * [25]).
 */

public class Ejercicio25 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        boolean prime;

        // Process
        for (int i = 0; i < 100; i++) {
            prime = true;
            num = (int) (Math.random() * 191) + 10;
            for (int j = 2; j < num / 2; j++) {
                if (num % j == 0)
                    prime = false;
            }

            // Output data
            if (num % 5 == 0)
                System.out.print("#" + num + "# ");
            else if (prime)
                System.out.print("[" + num + "] ");
            else if (!prime)
                System.out.print(num + " ");
        }

    }
}
