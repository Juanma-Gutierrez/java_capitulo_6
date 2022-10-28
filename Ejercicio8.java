/**
 * Exercise: 8
 *
 * @version: 28/10/2022
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea
 * de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que
 * salga 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        // Var declarations
        int num;
        String res;

        // Process
        for (int i = 1; i <= 15; i++) {
            System.out.printf("%-5s", i);
            for (int j = 0; j < 3; j++) {
                num = (int) (Math.random() * 6);
                if (num < 3)
                    res = "1";
                else if (num < 5)
                    res = "X";
                else
                    res = "2";
                System.out.printf("%-3s", res);
            }
            System.out.println();
        }
    }
}
