/**
 * Exercise: 20
 *
 * @version: 28/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 */

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        // Var declarations
        int cap;
        int water;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
        cap = sc.nextInt();
        water = (int) (Math.random() * (cap));

        // Process data
        for (int i = cap; i > water; i--)
            System.out.println("|          |");
        for (int i = water; i > 0; i--)
            System.out.println("|~~~~~~~~~~|");
        System.out.println("└──────────┘");
        System.out.print("La cuba tiene una capacidad de " + cap + " litros y contiene " + water + " litros de agua.");

        sc.close();
    }
}
