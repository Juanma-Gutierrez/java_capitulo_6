/**
 * Exercise: 26
 *
 * @version: 29/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que pinte una tableta de turrón con un bocado realizado
 * de forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El
 * bocado se da alrededor del turrón, obviamente no se puede dar un bocado por
 * en medio de la tableta.
 */

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        // Var declarations
        int height;
        int width;
        int pos;
        int numX;
        int numY;

        // Var init
        numX = 0;
        numY = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduzca la anchura de la tableta: ");
        width = sc.nextInt();
        System.out.print("Introduzca la altura de la tableta: ");
        height = sc.nextInt();

        // Process
        pos = (int) (Math.random() * 4);
        switch (pos) {
            case 0:
                if (pos == 0) {
                    numY = 0;
                    numX = (int) (Math.random() * width - 1);
                }
                break;
            case 1:
                if (pos == 1) {
                    numX = width - 1;
                    numY = (int) (Math.random() * height - 1);
                }
                break;
            case 2:
                if (pos == 2) {
                    numY = height - 1;
                    numX = (int) (Math.random() * width - 1);
                }
                break;
            case 3:
                if (pos == 0) {
                    numX = 0;
                    numY = (int) (Math.random() * height - 1);
                }
                break;
        }

        // Output data
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == numY && j == numX)
                    System.out.print(" ");
                else
                    System.out.print("X");
            }
            System.out.println();
        }

        sc.close();
    }
}
