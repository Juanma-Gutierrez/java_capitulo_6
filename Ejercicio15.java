/**
 * Exercise: 15
 *
 * @version: 28/10/2022 11:06
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un generador de melodía con las siguientes condiciones:
 * a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
 * sol, la y si.
 * b) Una melodía está formada por un número aleatorio de notas mayor o igual a
 * 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
 * c) Cada grupo de 4 notas será un compás y estará separado del siguiente
 * compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se
 * marca con dos barras.
 * d) La última nota de la melodía debe coincidir con la primera.
 *
 * Ejemplo 1:
 * do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
 *
 * Ejemplo 2:
 * la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa
 * la do la ||
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        // Var declarations
        int note;
        String noteString;
        String firstNote;
        int compass;

        // Var init
        compass = (int) ((Math.random() * 7) + 1);
        firstNote = "";
        noteString = "";

        // Process
        for (int i = 0; i < compass * 4; i += 4) {
            for (int j = 0; j < 4; j++) {
                note = (int) (Math.random() * 6);
                switch (note) {
                    case 0:
                        noteString = "do";
                        break;
                    case 1:
                        noteString = "re";
                        break;
                    case 2:
                        noteString = "mi";
                        break;
                    case 3:
                        noteString = "fa";
                        break;
                    case 4:
                        noteString = "sol";
                        break;
                    case 5:
                        noteString = "la";
                        break;
                    case 6:
                        noteString = "si";
                        break;
                }
                if (firstNote == "")
                    firstNote = noteString;
                if (i == (compass * 4) - 4 && j == 3)
                    System.out.print(firstNote + " |");
                else
                    System.out.print(noteString + " ");
            }
            System.out.print("| ");
        }

    }
}
