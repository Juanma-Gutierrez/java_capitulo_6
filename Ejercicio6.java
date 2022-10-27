/**
 * Exercise: 6
 *
 * @version: 27/10/2022 21:07
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
 * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
 * fallido, el programa dirá cuántas oportunidades quedan y si el número
 * introducido es menor o mayor que el número secreto.
 */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        int resp;
        int numTry;

        // Var init
        num = (int) (Math.random() * 101);
        numTry = 5;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Tienes " + numTry + " intentos, introduce un número del 0 al 100: ");
        resp = sc.nextInt();

        // Process
        do {
            if (resp != num) {
                if (resp > num)
                    System.out.println("El número introducido es mayor que el número secreto");
                else
                    System.out.println("El número introducido es menor que el número secreto");
                numTry--;
                System.out.println("Te quedan " + numTry + " intentos.");
                System.out.print("Introduce un nuevo número: ");
                resp = sc.nextInt();
            }
        } while (numTry > 1 && num != resp);

        if (resp == num)
            System.out.print("¡¡Has adivinado el número secreto!!");
        else
            System.out.print(
                    "No has podido adivinar el número secreto, que era el " + num + ". Mejor suerte la próxima vez.");

        sc.close();
    }
}
