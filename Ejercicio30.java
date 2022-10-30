/**
 * Exercise: 30
 *
 * @version: 29/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los
 * Reyes Magos le han traído un caballito de mar ($) y una caracola (@) para que
 * le hagan compañía al pez. Realiza un programa que pinte por pantalla la
 * pecera con los tres animalitos acuáticos colocados dentro en posiciones
 * aleatorias. Por una cuestión de física elemental, ninguno de los animales
 * puede coincidir en la misma posición. Se debe pedir al usuario el ancho y el
 * alto de la pecera, que como mínimo serán de 4 unidades.
 */

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        // Var declarations
        int height;
        int width;
        int seaHorseX;
        int seaHorseY;
        int conchX;
        int conchY;
        int fishX;
        int fishY;
        boolean animal;

        // Var init
        height = 0;
        width = 0;
        seaHorseX = 0;
        seaHorseY = 0;
        conchX = 0;
        conchY = 0;
        fishX = 0;
        fishY = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        do {
            if (height < 4) {
                System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
                height = sc.nextInt();
            }
            if (height >= 4) {
                System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
                width = sc.nextInt();
            }
        } while (height < 4 || width < 4);

        // Process
        do {
            seaHorseX = (int) (Math.random() * (width - 2)) + 1;
            seaHorseY = (int) (Math.random() * (height - 2)) + 1;
            conchX = (int) (Math.random() * (width - 2)) + 1;
            conchY = (int) (Math.random() * (height - 2)) + 1;
            fishX = (int) (Math.random() * (width - 2)) + 1;
            fishY = (int) (Math.random() * (height - 2)) + 1;

        } while ((seaHorseX == conchX && seaHorseY == conchY) ||
                (seaHorseX == fishX && seaHorseY == fishY) ||
                (conchX == fishX && conchY == fishY));

        // Output data
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                animal = false;

                if (i == seaHorseY && j == seaHorseX) {
                    System.out.print("$");
                    animal = true;
                }
                if (i == conchY && j == conchX) {
                    System.out.print("@");
                    animal = true;
                }
                if (i == fishY && j == fishX) {
                    animal = true;
                    System.out.print("&");
                }
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("*");
                } else if (!animal)
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
