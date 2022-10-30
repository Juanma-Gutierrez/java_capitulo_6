/**
 * Exercise: 32
 *
 * @version: 30/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con
 * el carácter “|”. La anchura del sendero siempre es la misma, los dos
 * caracteres del borde más cuatro caracteres en medio, en total 6 caracteres
 * (incluyendo espacios). A cada metro, el sendero puede continuar recto, girar
 * un carácter a la izquierda o girar un carácter a la derecha, por supuesto de
 * forma aleatoria. Por cada metro de sendero - representado por una línea -
 * puede que haya un obstáculo o puede que no, la probabilidad es del 50%. La
 * posición del obstáculo es aleatoria dentro de la línea. En caso de existir un
 * obstáculo en un metro de sendero (en una línea), puede ser una planta
 * (carácter *) o una piedra (carácter O), la probabilidad de que salga uno u
 * otro es la misma. Recuerda que nunca habrá más de un obstáculo por metro de
 * sendero, habrá uno o ninguno.
 */

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        // Var declarations
        int pathLength;
        int pathPos;
        int obstProb;
        int obstPos;
        String obst;

        // Var init
        obst = "";

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduzca la longitud del sendero en metros: ");
        pathLength = sc.nextInt();
        pathPos = (int) (Math.random() * 50) + 1;

        // Process
        // Print all the path
        for (int i = 0; i < pathLength; i++) {
            // Print spaces at left
            for (int j = 0; j < pathPos; j++)
                System.out.print(" ");
            pathPos += (int) (Math.random() * 3) - 1;

            // Check obstacles
            obstProb = (int) (Math.random() * 100) + 1;
            if (obstProb >= 50) {
                obstProb = (int) (Math.random() * 2);
                switch (obstProb) {
                    case 0:
                        obst = "*";
                        break;
                    case 1:
                        obst = "O";
                        break;
                }
                obstPos = (int) (Math.random() * 4);
                System.out.print("|");
                for (int k = 0; k < 4; k++) {
                    if (k == obstPos)
                        System.out.print(obst);
                    else
                        System.out.print(" ");
                }
                System.out.print("|");
            } else
                System.out.print("|    |");

            //
            System.out.println();
        }

        sc.close();
    }

}
