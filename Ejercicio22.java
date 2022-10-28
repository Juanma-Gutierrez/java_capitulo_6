/**
 * Exercise: 22
 *
 * @version: 28/10/2022 20:42
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
 * aleatorio. La cabeza se representará con el carácter @ y se debe colocar
 * exactamente en la posición 13 (con 12 espacios delante). A partir de ahí, el
 * cuerpo irá serpenteando de la siguiente manera: se generará de forma
 * aleatoria un valor entre tres posibles que hará que el siguiente carácter se
 * coloque una posición a la izquierda del anterior, alineado con el anterior o
 * una posición a la derecha del anterior. La longitud de la serpiente se pedirá
 * por teclado y se supone que el usuario introducirá un dato correcto.
 */

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        // Var declarations
        int snakeLength;
        int position;

        // Var init
        position = 13;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
        snakeLength = sc.nextInt();

        // Process
        System.out.println("            @");
        for (int i = 0; i < snakeLength - 1; i++) {
            position += (int) ((Math.random() * 3)) - 1;
            for (int j = 0; j < position - 1; j++)
                System.out.print(" ");
            System.out.println("X");
        }

        sc.close();
    }
}
