/**
 * Exercise: 28
 *
 * @version: 29/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que sea capaz de recolocar los números de un array de
 * fuera hacia adentro. En primer lugar, el programa pedirá al usuario el tamaño
 * del array. A continuación generará un array con ese tamaño con números
 * enteros aleatorios entre 0 y 200 ambos incluidos. Seguidamente el programa
 * irá colocando desde fuera hacia adentro los números de tal forma que el
 * primero se coloca en la primera posición, el segundo en la última, el tercero
 * en la segunda, el cuarto en la penúltima, el quinto en la tercera, en sexto
 * en la antepenúltima, etc. Se debe mostrar por pantalla tanto el array
 * original como el array resultado.
 */

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        // Var declarations
        int[] list;
        int size;
        int count;
        int[] listAux;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Introduce el tamaño del array: ");
        size = sc.nextInt();

        // Var init
        count = 0;
        list = new int[size];
        listAux = new int[size];

        // Fill the array
        for (int i = 0; i < size; i++) {
            list[i] = (int) (Math.random() * 201);
        }

        // Process
        System.out.print("Lista original: ");
        for (int n : list) {
            System.out.print(n + " ");
        }

        // Moving even data
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                listAux[count] = list[i];
                count++;
            }
        }
        // Moving odd data
        count = size - 1;
        for (int i = 0; i < size; i++) {
            if (i % 2 != 0) {
                listAux[count] = list[i];
                count--;
            }
        }

        // Output data
        System.out.print("\nLista final: ");
        for (int n : listAux) {
            System.out.print(n + " ");
        }

        sc.close();
    }

}
