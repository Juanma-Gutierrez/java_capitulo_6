/**
 * Exercise: 11
 *
 * @version: 28/10/2022 09:03
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc.
 */

public class Ejercicio11 {
    public static void main(String[] args) {
        // Var declarations
        int suspenso;
        int suficiente;
        int bien;
        int notable;
        int sobresaliente;
        int nota;

        // Var init
        suspenso = 0;
        suficiente = 0;
        bien = 0;
        notable = 0;
        sobresaliente = 0;

        // Process
        for (int i = 0; i < 20; i++) {
            nota = (int) ((Math.random() * 11));
            if (nota >= 9)
                sobresaliente++;
            else if (nota >= 7)
                notable++;
            else if (nota >= 6)
                bien++;
            else if (nota >= 5)
                suficiente++;
            else
                suspenso++;
        }
        System.out.printf("%-20s%2d\n", "Sobresalientes:", sobresaliente);
        System.out.printf("%-20s%2d\n", "Notables:", notable);
        System.out.printf("%-20s%2d\n", "Bienes:", bien);
        System.out.printf("%-20s%2d\n", "Suficientes:", suficiente);
        System.out.printf("%-20s%2d\n", "Suspensos:", suspenso);
    }
}
