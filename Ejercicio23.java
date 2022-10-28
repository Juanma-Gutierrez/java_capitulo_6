/**
 * Exercise: 23
 *
 * @version: 28/10/2022 21:16
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y
 * 8. Escribe un programa que genere de forma aleatoria la tirada de cinco
 * dados.
 */

public class Ejercicio23 {
    public static void main(String[] args) {
        // Var declarations
        int dice;
        String face;

        // Var init;
        face = "";

        // Process
        for (int i = 0; i < 5; i++) {
            dice = (int) (Math.random() * 6);
            switch (dice) {
                case 0:
                    face = "7";
                    break;
                case 1:
                    face = "8";
                    break;
                case 2:
                    face = "J";
                    break;
                case 3:
                    face = "Q";
                    break;
                case 4:
                    face = "K";
                    break;
                case 5:
                    face = "As";
                    break;
            }
            System.out.print(face + " ");
        }
    }
}
