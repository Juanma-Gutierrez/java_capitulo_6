/**
 * Exercise: 29
 *
 * @version: 29/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que muestre la previsión del tiempo para mañana en
 * Málaga. Las temperaturas máxima y mínima se deben generar de forma aleatoria
 * entre los intervalos máximos y mínimos absolutos medidos en las últimas
 * décadas para cada estación. La probabilidad de que esté soleado o nublado en
 * cada estación se proporciona a continuación. Obviamente, la temperatura
 * mínima deberá ser menor o igual que la temperatura máxima.
 * 
 *                                   +---------+---------+---------+---------+
 *                                   |Primavera| Verano  |  Otoño  |Invierno |
 * +---------------------------------+---------+---------+---------+---------+
 * | Temperatura mínima absoluta     |    15   |    25   |    20   |    0    |
 * +---------------------------------+---------+---------+---------+---------+
 * | Temperatura máxima absoluta     |    30   |    45   |    30   |    25   |
 * +---------------------------------+---------+---------+---------+---------+
 * | Probabilidad de soleado-nublado | 60%-40% | 80%-20% | 40%-60% | 20%-80% |
 * +---------------------------------+---------+---------+---------+---------+
 * Ejemplo:
 * 1. Primavera
 * 2. Verano
 * 3. Otoño
 * 4. Invierno
 * Seleccione la estación del año (1-4): 4
 *
 * Previsión del tiempo para mañana
 * --------------------------------
 * Temperatura mínima: 10ºC
 * Temperatura máxima: 16ºC
 * Nublado
 */

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        // Var declaration
        int station;
        int min;
        int max;
        int minProb;
        int maxProb;
        int sunny;
        int sunnyProb;

        // Var init
        minProb = 0;
        maxProb = 0;
        sunnyProb = 0;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.println("1. Primavera");
        System.out.println("2. Verano");
        System.out.println("3. Otoño");
        System.out.println("4. Invierno");
        System.out.println("Seleccione la estación del año (1-4): ");
        station = sc.nextInt();

        // Process
        switch (station) {
            case 1:
                minProb = 15;
                maxProb = 30;
                sunnyProb = 60;
                break;
            case 2:
                minProb = 25;
                maxProb = 45;
                sunnyProb = 80;
                break;
            case 3:
                minProb = 20;
                maxProb = 30;
                sunnyProb = 40;
                break;
            case 4:
                minProb = 0;
                maxProb = 25;
                sunnyProb = 20;
                break;
        }

        // Output data
        System.out.println("Previsión del tiempo para mañana");
        System.out.println("--------------------------------");
        min = (int) (Math.random() * (maxProb - minProb) + 1) + minProb;
        do {
            max = (int) (Math.random() * (maxProb - minProb) + 1) + minProb;

        } while (max < min);
        System.out.println("Temperatura mínima: " + min);
        System.out.println("Temperatura máxima: " + max);
        sunny = (int) ((Math.random()) * 100);
        if (sunny <= sunnyProb)
            System.out.println("Soleado");
        else
            System.out.println("Nublado");
        sc.close();
    }

}
