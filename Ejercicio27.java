/**
 * Exercise: 27
 *
 * @version: 29/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
 * jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
 * introduce una opción incorrecta, el programa deberá mostrar un mensaje de
 * error.
 */

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        // Var declarations
        String playerMove;
        String cpuMove;
        int cpuRandomMove;

        // Var init
        cpuMove = "";

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        do {
            System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
            playerMove = sc.next();
        } while (!playerMove.equals("piedra") && !playerMove.equals("papel") && !playerMove.equals("tijera"));

        // Process
        cpuRandomMove = (int) (Math.random() * 3);
        switch (cpuRandomMove) {
            case 0:
                cpuMove = "piedra";
                break;
            case 1:
                cpuMove = "papel";
                break;
            case 2:
                cpuMove = "tijera";
                break;
        }

        // Output data
        System.out.println("Turno del ordenador: " + cpuMove);
        if (cpuMove.equals(playerMove))
            System.out.print("Empate");
        else {
            if ((cpuMove.equals("papel") && playerMove.equals("piedra")) ||
                    (cpuMove.equals("tijera") && playerMove.equals("papel")) ||
                    (cpuMove.equals("piedra") && playerMove.equals("tijera")))
                System.out.print("Gana el ordenador");
            else
                System.out.print("Gana el jugador");
        }
        sc.close();
    }
}
