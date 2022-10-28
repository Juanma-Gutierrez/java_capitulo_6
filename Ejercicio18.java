/**
 * Exercise: 18
 *
 * @version: 28/10/2022 16:18
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
 * sustituir el color blanco por colores más alegres. Realiza un programa que
 * genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
 * cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
 * que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
 * violeta y naranja.
 */

public class Ejercicio18 {
    public static String getColor(int num) {
        String color;
        color = "";
        switch (num) {
            case 0:
                color = "rojo";
                break;
            case 1:
                color = "azul";
                break;
            case 2:
                color = "verde";
                break;
            case 3:
                color = "amarillo";
                break;
            case 4:
                color = "violeta";
                break;
            case 5:
                color = "naranja";
                break;
        }
        return color;
    }

    public static void main(String[] args) {
        // Var declarations
        String room1;
        String room2;
        String room3;

        // Process
        do {
            room1 = getColor((int) (Math.random() * 5));
            room2 = getColor((int) (Math.random() * 5));
            room3 = getColor((int) (Math.random() * 5));
        } while (room1 == room2 || room2 == room3 || room1 == room3);
        System.out.println("Color de la habitación 1: " + room1);
        System.out.println("Color de la habitación 2: " + room2);
        System.out.println("Color de la habitación 3: " + room3);
    }
}
