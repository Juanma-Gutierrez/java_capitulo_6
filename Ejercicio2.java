/**
 * Exercise: 2
 *
 * @version: 27/10/2022 07:40
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja
 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
 * diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
 * cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A
 * (que sería el 1). Para convertir un número en una cadena de caracteres
 * podemos usar String.valueOf(n).
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        int suit;
        String numLit;
        String suitLit;

        // Var init
        numLit = "";
        suitLit = "";

        // Process
        num = (int) (Math.random() * 13) + 1;
        suit = (int) (Math.random() * 4) + 1;

        // Output data
        switch (num) {
            case 1:
                numLit = "As";
                break;
            case 11:
                numLit = "J";
                break;
            case 12:
                numLit = "Q";
                break;
            case 13:
                numLit = "K";
                break;
            default:
                numLit = String.valueOf(num);
                break;
        }
        switch (suit) {
            case 1:
                suitLit = "Picas";
                break;
            case 2:
                suitLit = "Corazones";
                break;
            case 3:
                suitLit = "Diamantes";
                break;
            case 4:
                suitLit = "Tréboles";
                break;
        }
        System.out.print("La carta escogida es: " + numLit + " de " + suitLit);
    }
}
