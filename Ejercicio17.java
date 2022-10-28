/**
 * Exercise: 17
 *
 * @version: 28/10/2022 14:14
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
 * serán de 4 unidades. No hay que comprobar que los datos se introducen
 * correctamente; podemos suponer que el usuario los introduce bien. Dentro de
 * la pecera hay que colocar de forma aleatoria un pececito, que puede estar
 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
 * rectángulo.
 */

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        // Var declarations
        int height;
        int width;
        int fishX;
        int fishY;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce la altura de la pecera: ");
        height = sc.nextInt();
        System.out.print("Introduce el ancho de la pecera: ");
        width = sc.nextInt();

        // Process
        fishX = (int) ((Math.random() * (width - 2)) + 1);
        fishY = (int) ((Math.random() * (height - 2)) + 1);

        // Output data
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == fishY && j == fishX) {
                    System.out.print("@");
                } else {
                    if (i == 0 || i == height - 1 || j == 0 || j == width - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
