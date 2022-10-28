/**
 * Exercise: 13
 *
 * @version: 28/10/2022 09:50
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor.
 */

public class Ejercicio13 {
    public static void main(String[] args) {
        // Var declarations
        int dice1;
        int dice2;
        int cont;

        // Var init
        cont = 0;

        do {
            cont++;
            dice1 = (int) ((Math.random() * 6) + 1);
            dice2 = (int) ((Math.random() * 6) + 1);
            System.out.println("Tirada nº: " + cont + "\tDado 1: " + dice1 + "\tDado 2: " + dice2);
        } while (dice1 != dice2);
        System.out.println("Han coincidido los dados con el número " + dice1);
    }

}
