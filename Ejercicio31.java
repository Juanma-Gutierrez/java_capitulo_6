/**
 * Exercise: 31
 *
 * @version: 30/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la
 * partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
 * muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u
 * 11, el jugador gana la misma cantidad que apostó y termina la partida. Por
 * ej. si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos
 * dados suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida.
 * Si no se da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o
 * 10, el juego entra en una segunda etapa. En esta etapa, el jugador buscará
 * volver a obtener ese número en los dados. Si consigue repetir ese número,
 * gana. Si sale un 7, pierde. Si sale otro número, tiene que seguir tirando.
 */

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        // Var declarations
        int bet;
        int dice1;
        int dice2;
        int roll;
        boolean secondPlay;

        // Var init
        bet = 0;
        dice1 = 0;
        dice2 = 0;
        secondPlay = false;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.println("Por favor, indique cuánto quiere apostar: ");
        bet = sc.nextInt();
        dice1 = (int) (Math.random() * 6) + 1;
        dice2 = (int) (Math.random() * 6) + 1;
        roll = dice1 + dice2;
        System.out.println("La tirada del jugador ha sido: " + dice1 + " y " + dice2 + ", es decir, "
                + (dice1 + dice2));

        // Process
        if ((roll == 7) || (roll == 11)) {
            bet = bet * 2;
        } else if ((roll == 2) || (roll == 3) || (roll == 12)) {
            bet = 0;
        } else {
            // Second play
            secondPlay = true;
            do {
                dice1 = (int) (Math.random() * 6) + 1;
                dice2 = (int) (Math.random() * 6) + 1;
                System.out.println("La siguiente tirada del jugador ha sido: " + dice1 + " y " + dice2 + ", es decir, "
                        + (dice1 + dice2));
                if (dice1 + dice2 == roll) {
                    bet = bet * 2;
                    secondPlay = false;
                } else if (dice1 + dice2 == 7) {
                    bet = 0;
                    secondPlay = false;
                }
            } while (secondPlay);
        }
        System.out.println(bet != 0 ? "El jugador ha ganado: " + bet : "El jugador ha perdido la apuesta");

        sc.close();
    }

}
