/**
 * Exercise: 14
 *
 * @version: 28/10/2022 10:03
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
 * El programa intentará adivinar el número que estás pensando - un número entre
 * 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
 * programa debe preguntar si el número que estás pensando es mayor o menor que
 * el que te acaba de decir.
 */
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        int max;
        int min;
        int numTry;
        boolean error;
        String resp;

        // Var init
        max = 100;
        min = 0;
        resp = "";
        numTry = 5;
        error = false;

        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.println("Piensa un número del 0 al 100, tengo 5 oportunidades para adivinarlo");

        // Process
        do {
            num = (int) (Math.random() * (max - min) + min);
            if (min > max) {
                System.out.print("Creo que te has equivocado al darme alguna respuesta.");
                numTry = 0;
                error = true;
            } else {

                System.out.println("¿Es el " + num + "? (mayor/menor/correcto)");
                resp = sc.next();
                if (!resp.equals("correcto")) {
                    if (resp.equals("mayor"))
                        min = num + 1;
                    else if (resp.equals("menor"))
                        max = num - 1;
                    numTry--;
                }
            }
        } while (numTry >= 1 && !resp.equals("correcto"));

        if (!error)
            if (resp.equals("correcto"))
                System.out.print("Soy un crack, he adivinado tu número, que era el " + num);
            else
                System.out.print("Vaya, no he podido adivinar el número.");

        sc.close();
    }
}
